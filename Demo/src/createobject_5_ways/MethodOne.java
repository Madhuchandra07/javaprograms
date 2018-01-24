package createobject_5_ways;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class MethodOne {
	
	
	public String callThis(){
		return "Hello";
	}
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, ClassNotFoundException {
		MethodOne one=new MethodOne();
		MethodOne three= (MethodOne) Class.forName("createobject_5_ways.MethodOne").newInstance();
		System.out.println("=====");
		System.out.println(three.callThis());
		
		Constructor<MethodOne> con=MethodOne.class.getConstructor();
		MethodOne two=con.newInstance();
		
		
		System.out.println(two.callThis());
	}

}
