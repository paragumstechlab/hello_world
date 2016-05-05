package com.testingground.offline;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashMapTest
{
	public static void main(String[] args)
	{
		//String str_one = "Fri Apr 01 2016 00:00:00 GMT+0530 (IST)";
		String dateStr_one = "Mon Jun 30 00:12:00 IST 2016";
		String dateStr = "Mon Jun 18 00:00:00 IST 2012";
		//DateFormat formatter = new SimpleDateFormat("E MMM dd HH:mm:ss Z yyyy");
		DateFormat formatter = new SimpleDateFormat("E M dd HH:mm:ss Z yyyy");
		Date date = (Date)formatter.parse(dateStr);
		System.out.println("First: "+date);

		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		String formatedDate = cal.get(Calendar.DATE) + "/" + (cal.get(Calendar.MONTH) + 1) + "/" +         cal.get(Calendar.YEAR);
		System.out.println("Formatted Date : " + formatedDate);

		Map<Integer,Set<String>> user_map = new HashMap<Integer,Set<String>>();
		Set<String> user_set = new HashSet<String>();

		user_set.add("parag");
		user_map.put(1, user_set);
		user_set.add("parag1");
		user_map.put(2, user_set);
		user_set.add("parag2");
		user_map.put(3, user_set);

		for (int itr : user_map.keySet())
		{
			System.out.println(itr+" : "+user_map.get(itr));
		}
	}
}