package externalization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
	
	ExternalizationBean test=new ExternalizationBean();
	
	
	FileInputStream f=new FileInputStream("machi.txt");
	
	ObjectInputStream o=new ObjectInputStream(f);
     test.readExternal(o);
     System.out.println(test.getId()+" : "+test.getName());

}
	public void m1(){
		System.out.println("hello");
	}
}