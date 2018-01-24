package com.madhuchandra.collections.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> l=new ArrayList<String>();
		l.add("A");
		l.add("madhu");
		l.add("chandra");
		System.out.println(l);
		
		List l1=Collections.synchronizedList(l);
		System.out.println(l1);
		
//		l.add(1,"madhu");
//		l.add(2,"chandra");
//		System.out.println(l);

	}

}
