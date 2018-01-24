package com.madhuchandra.singleton;

public class MySingleTon {
	private static MySingleTon myObj;
    /**
     * Create private constructor
     */
    private MySingleTon(){
         
    }
    /**
     * Create a static method to get instance.
     */
    public static MySingleTon getInstance(){
        if(myObj == null){
            myObj = new MySingleTon();
        }
        return myObj;
    }
     
    public void getSomeThing(){
        // do something here
        System.out.println("I am here....");
    }
    public void doSomething(){
    	System.out.println("do something method");
    }
     
    public static void main(String a[]){
        MySingleTon st = MySingleTon.getInstance();
        MySingleTon st1=new MySingleTon();
        System.out.println("======");
        System.out.println(st==st1);
        MySingleTon st2=new MySingleTon();
        st1.getSomeThing();
        st.doSomething();
        System.out.println(st);
        System.out.println(st1);
        System.out.println("myobj :  "+myObj);
        System.out.println(myObj==st);
    }
}