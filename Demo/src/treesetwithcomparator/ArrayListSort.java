package treesetwithcomparator;

import java.util.ArrayList;

public class ArrayListSort implements Comparable {
	public static void main(String[] args) {
		PojoClass c=new PojoClass();
		c.setId(1);
		c.setName("Madhu");
		PojoClass c1=new PojoClass();
		c1.setId(20);
		c1.setName("Narendra");

	PojoClass c2=new PojoClass();
	c2.setId(5);
	c2.setName("Babu");
	
	ArrayList al=new ArrayList();
	al.add(c);
	al.add(c1);
	al.add(c2);
	System.out.println(al);
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
