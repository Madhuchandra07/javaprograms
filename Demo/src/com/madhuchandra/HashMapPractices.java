package com.madhuchandra;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapPractices {
	public static void main(String[] args){
		HashMap<Integer, String> h=new HashMap<Integer, String>();
		
		h.put(1, "madhu");
		h.put(2, "Kiran");
		h.put(3, "Dhilip");
		h.put(1,"madhu");//duplicate key
	/*	h.put(null,null);
		h.put(null,"arun");
		h.put(null, "chandra");*/
		h.put(4,"Harish");
		System.out.println(h);
		System.out.println(h.get(1));
		
		System.out.println("============");
		System.out.println(h);
		
		Set<Entry<Integer, String>> s1=h.entrySet();
	
		Iterator<Map.Entry<Integer, String>> itr=s1.iterator();
		while(itr.hasNext()){
			Map.Entry<Integer, String> m1 =(Map.Entry<Integer,String>)itr.next();
			if(m1.getKey().equals(4)){
				m1.setValue("Brahmi");
			}
			
			System.out.println(m1.getKey()+"  "+m1.getValue());
		}
		
		
		
	}

}
