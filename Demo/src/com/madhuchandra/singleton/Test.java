package com.madhuchandra.singleton;

public class Test {

	public static void main(String[] args) {
		ImmutableClassDemo im=new ImmutableClassDemo(1, "madhu");
		System.out.println(im.id);
		System.out.println(im.name);

	}

}
