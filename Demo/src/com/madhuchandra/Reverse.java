package com.madhuchandra;

public class Reverse {
	
	
	
	

	public static void main(String[] args) {
		String s="madhu";
		//char[] ch=new char[s.length()];
		char[] ch=s.toCharArray();
		/*for(int i=0;i<s.length();i++){
			ch[i]=s.charAt(i);
		}*/
		for(int i=s.length()-1;i>=0;i--){
		System.out.println(ch[i]);
			
		}

	}

}
