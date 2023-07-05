package ch11;

import java.util.*;

public class HashMapEx2 {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("trump", new Integer(90));
		map.put("trump", new Integer(100));
		map.put("biden", new Integer(100));
		map.put("obama", new Integer(80));
		map.put("bush", new Integer(90));
		
		Set set = map.entrySet();
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			System.out.println("name :"+e.getKey()+", score :"+e.getValue());
		}
		
		set = map.keySet();
		System.out.println("name list :"+set);
		
		Collection values = map.values();
		it = values.iterator();
		
		int total = 0;
		
		while(it.hasNext()) {
			Integer i = (Integer)it.next();
			total += i.intValue();
		}
		
		System.out.println("total score :"+total);
		System.out.println("average :"+ (float)total/set.size());
		System.out.println("best score :"+Collections.max(values));
		System.out.println("worst score :"+Collections.min(values));
	}

}
