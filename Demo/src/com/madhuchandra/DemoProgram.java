package com.madhuchandra;

public class DemoProgram {
	
	public static void main(String[] args){
		int x=2,y=3,z=5;
		x++;
		y++;
		System.out.println(x++*y++*--z);
		
	}
	
static{
	
	System.out.println("hi this is static block");
}

}
