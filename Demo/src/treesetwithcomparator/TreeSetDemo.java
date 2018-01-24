package treesetwithcomparator;

import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		
	
	
	TreeSet<Integer> t=new TreeSet<Integer>(new MyComparator());
	t.add(20);
	t.add(15);
	t.add(30);
	t.add(50);
	t.add(10);
	System.out.println(t);
	
	
	TreeSet<String> t1=new TreeSet<String>(new MyComparator1());
	t1.add("madhu");
	t1.add("narendra");
	t1.add("dhilip");
	t1.add("Babu");
	System.out.println(t1);
	

}
}