package stringconcept;

public class StringIntern {
	public static void main(String[] args) {
		String s="madhu";
		String s1=new String("madhu");
		String s2=s1.intern();
		
		System.out.println(s==s1);
		System.out.println(s2==s);
		System.out.println(s2=s1.intern());
	}

}
