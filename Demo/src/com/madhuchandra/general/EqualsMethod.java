package com.madhuchandra.general;

public class EqualsMethod {
	private int age;
	private String fname;
	private String lname;


	public static void main(String[] args) {

		/*String s=new String("Madhu");
		String s2=new String("Madhu");
		System.out.println(s.equals(s2));*/
		
		EqualsMethod e=new EqualsMethod(24);
		EqualsMethod e1=new EqualsMethod(24);
		System.out.println(e.equals(e1));
		System.out.println(e==e1);
		System.out.println("========");
		System.out.println(e.getClass());
	}
	
	
 public EqualsMethod(int age) {
		super();
		this.age = age;
		
	}


public boolean equals(Object obj){
	 if (this == obj) return true;
	    //if (obj == null) return false;
	    //if (this.getClass() != obj.getClass()) return false;
	    EqualsMethod that = (EqualsMethod) obj;
	    if (this.age != that.age) return false;
	    //if (!this.fname.equals(that.fname)) return false;
	    //if (!this.lname.equals(that.lname)) return false;
		return true;
	
	
}
}