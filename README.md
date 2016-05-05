# hello_world
This is the first branch that I've created
This is the first branch that I've created from my desktop application
This is the second branch that I've created from my desktop application
This is the second branch that I've created from my desktop application

netsh wlan set hostednetwork mode=allow ssid=Anonymous key=mywifi4411
netsh wlan start hostednetwork

=HOUR(C760)+(MINUTE(C760)/60)
=IF(SECOND(C760)>30, =HOUR(c760)+((MINUTE(c760)+1)/60), =HOUR(c760)+(MINUTE(c760)/60))

//Add AdHoc
function AddAdHoc()
{
  var html = HtmlService.createHtmlOutputFromFile('add_adhoc')
  .setSandboxMode(HtmlService.SandboxMode.IFRAME);

  SpreadsheetApp.getUi() // Or DocumentApp or FormApp.
  .showModalDialog(html, 'AdHoc Master Master');
}//AddAdHoc

//View AdHoc Master
function ViewAdHoc()
{
  var option=
      {
        "method":"post",
        //"headers":headers,
        "muteHttpExceptions": true
      };
  var response=UrlFetchApp.fetch('https://script.google.com/macros/s/AKfycbyWyaNxwT3qUowO_P25oArij_38F40x0aLy1PnJmozbsTdBfb3Z/exec',option);
  Logger.log(response);
}//ViewAdHoc

//Edit Ad Hoc
function UpdateAdHoc()
{
  var column_name = SpreadsheetApp.getActiveSheet().getRange('A1').getValue();
  if(column_name == 'Task Id')
  {
    var row = SpreadsheetApp.getActiveSheet().getActiveCell().getRowIndex();

    Logger.log("ed"+row);

    var lastRow = SpreadsheetApp.getActiveSheet().getLastRow();

    if(row > 1 && row <= lastRow)
    {
      var html = HtmlService.createHtmlOutputFromFile('Update_adhoc').setSandboxMode(HtmlService.SandboxMode.IFRAME);
      SpreadsheetApp.getUi() // Or DocumentApp or FormApp.
      .showModalDialog(html, 'AdHoc Master');
    }//if
    else
      Browser.msgBox("Please select a row other than column header or an empty row");
  }//if
  else
  {
    Browser.msgBox("Please switch to AdHoc View to edit a task from AdHoc Master");
  }//else
}//EditAdHoc

//Delete AdHoc
function DeleteAdHoc()
{
  var column_name = SpreadsheetApp.getActiveSheet().getRange('A1').getValue();
  if(column_name == 'Task Id')
  {
    var row = SpreadsheetApp.getActiveSpreadsheet().getActiveCell().getRowIndex();
    Logger.log(row);
    var lastRow = SpreadsheetApp.getActiveSheet().getLastRow();

    if(row > 1 && row <= lastRow)
    {
      Logger.log("in if");
      var task_id = SpreadsheetApp.getActiveSpreadsheet().getRange("A"+row).getValue().toString();
      var username = "yogi_app";
      var password = "e10adc3949ba59abbe56e057f20f883e";
      var headers = {"Authorization":"Basic "+Utilities.base64Encode(username+":"+password)};
      var payload = {
        "task_id" : task_id
      };

      var option = {
        "method":"post",
        "headers":headers,
        "payload":payload,
        "muteHttpExceptions": true
      };

      var response=UrlFetchApp.fetch("https://sardayogiapp.appspot.com/DeleteAdHocTasks",option);

      Logger.log(response);

      if(response==1)
        ViewAdHoc();
      else
        Browser.msgBox("Promoter Deletion Failed! Please try again");
    }//if
    else
      Browser.msgBox("Please select a valid row other than column header or an empty row");
    //Browser.msgBox("Please select a valid row");
  }//if
  else
    Browser.msgBox("Please switch to AdHoc View to delete a task from AdHoc Master");
}//DeleteAdHoc