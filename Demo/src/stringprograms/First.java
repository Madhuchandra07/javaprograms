package stringprograms;

public class First {
	public static void main(String[] args) {
		String s1="narendra";
		String s2=new String("madhu");
		String s3=new String("narendra");
		String s4="madhu";
		String s5="narendra";
		
		String s6=s3.intern();
		System.out.println(s6==s1);
		
	System.out.println(s1.equals(s3));
	System.out.println(s5==s1);
	}

}
