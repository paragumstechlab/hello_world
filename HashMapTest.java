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
		String dateStr = "Mon Jun 18 00:00:00 IST 2012";
		//DateFormat formatter = new SimpleDateFormat("E MMM dd HH:mm:ss Z yyyy");
		DateFormat formatter = new SimpleDateFormat("E M dd HH:mm:ss Z yyyy");
		Date date = (Date)formatter.parse(dateStr);
		System.out.println("First: "+date);

		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		String formatedDate = cal.get(Calendar.DATE) + "/" + (cal.get(Calendar.MONTH) + 1) + "/" +         cal.get(Calendar.YEAR);
		System.out.println("Formatted Date : " + formatedDate);

		/*Map<Integer,Map<String,String>> user_map1 = new HashMap<Integer,Map<String,String>>();
		Map<String,String> user_set1 = new HashMap<String,String>();

		user_set1.put("user_name", "Parag");
		user_set1.put("user_email", "abc@example.com");
		user_map1.put(1, user_set1);

		user_set1.put("user_name", "Parag1");
		user_set1.put("user_email", "xyz@example.com");
		user_map1.put(2, user_set1);

		user_set1.put("user_name", "Parag2");
		user_set1.put("user_email", "pqr@example.com");
		user_map1.put(3, user_set1);

	    //System.out.println(user_map1.get(1));


		for (int itr : user_map1.keySet())
		{
			System.out.println(itr+" : "+user_map1.get(itr));
		}*/

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