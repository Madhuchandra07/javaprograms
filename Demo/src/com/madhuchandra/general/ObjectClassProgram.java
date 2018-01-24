package com.madhuchandra.general;

import java.lang.reflect.Method;

public class ObjectClassProgram {

	public static void main(String[] args) {
		 Object o = new Object();
         Class c=o.getClass();
 Method[] m=c.getDeclaredMethods();
 for(Method m1:m) {
         System.out.println(m1);

	}

}
}