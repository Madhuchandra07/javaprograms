package com.madhuchandra.general;

import java.util.LinkedHashSet;
import java.util.Set;

public class ReverseString {

	public static void main(String[] args) {
		String s="aabbcdefgggh";
	char[] ch=	s.toCharArray();
		
		Set s1=new LinkedHashSet();
		for(char c:ch){
			s1.add(c);
		}
System.out.println(s1);
	}

}
