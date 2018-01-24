package com.madhuchandra.singleton;

public class DemoSingleton {

	public static void main(String[] args) {
	
		
	MySingleTon my=MySingleTon.getInstance();
	MySingleTon my1=MySingleTon.getInstance();
	System.out.println(my1);
	System.out.println(my);
	System.out.println(my==my1);

	}

}
