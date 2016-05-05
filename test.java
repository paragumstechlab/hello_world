package com.test;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class datePoc
{
  public static void main(String[] args)
  {
    Date today = new Date();
    Calendar cal = new GregorianCalendar();
    cal.setTime(today);
    cal.add(Calendar.DAY_OF_MONTH, -30);
    Date today30 = cal.getTime();
    System.err.println(today30);
    cal.add(Calendar.DAY_OF_MONTH, -60);
    Date today60 = cal.getTime();
    System.err.println(today60);
    cal.add(Calendar.DAY_OF_MONTH, -90);
    Date today90 = cal.getTime();
    System.err.println(today90);
  }
}