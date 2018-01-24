package com.madhuchandra;

import java.util.HashMap;
import java.util.WeakHashMap;

public class WeakHashMapProgram {

	public static void main(String[] args) throws InterruptedException {

		WeakHashMap<Object, String> h1=new WeakHashMap<Object, String>();
		//HashMap<Object, String> h1=new HashMap<Object, String>();
		h1.put(1, "Madhuchandra");
		h1.put(10, "Narendra");
		h1.put(20, "Dhilip");
		
		Temp t=new Temp();
		h1.put(t, "Rockstar");
		System.out.println(h1);
		t=null;
		System.gc();
		Thread.sleep(5000);
		System.out.println(h1);
	}

}
class Temp{
	public String toString(){
		return "temp";
		
	}
	public void finalize(){
		System.out.println("Finalize method called");
		
	}
}
