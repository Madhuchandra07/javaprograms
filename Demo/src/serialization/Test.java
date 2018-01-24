package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		SerializableBean s=new SerializableBean();
	/*s.setId(101);
	s.setName("Chandra");
		
		FileOutputStream fin=new FileOutputStream("machi1.txt");
		ObjectOutputStream oin=new ObjectOutputStream(fin);
		oin.writeObject(s);
		oin.flush();*/
		FileInputStream fin=new FileInputStream("machi1.txt");
		ObjectInputStream oin=new ObjectInputStream(fin);
		SerializableBean s1=(SerializableBean) oin.readObject();
		System.out.println(s1.getId()+" :"+s1.getName());
		System.out.println("success");
		
	}

}
