  Enumeration<String> parameterNames = req.getParameterNames();

  while (parameterNames.hasMoreElements())
  {
    String paramName = parameterNames.nextElement();
    String[] paramValues = req.getParameterValues(paramName);
    for (int i = 0; i < paramValues.length; i++)
    {
      String paramValue = paramValues[i];
      log.warning("\n"+paramName+"\t" + paramValue);
    }
  }

  String planner_created_date = null;
  String planner_month_year = null;
  String planner_date = null;
  String planner_objective_for_selecting_market = null;
  String planner_status = null;
  String plnr_tbl_fk_created_by = null;
  String plnr_tbl_fk_country_id = null;
  String plnr_tbl_fk_state_id = null;
  String plnr_tbl_fk_region_id = null;
  String plnr_tbl_fk_head_quarter_id = null;
  String plnr_tbl_fk_district_id = null;
  String plnr_tbl_fk_city_id = null;
  String plnr_tbl_fk_route_id = null;

  JSONObject json_data_input = new JSONObject(json_data);
  JSONArray planner_array = json_data_input.getJSONArray("planner_data");
  JSONObject obj = null;
