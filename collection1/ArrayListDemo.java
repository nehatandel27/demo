package collection1;

import java.util.HashSet;

//set will don't allow duplicate object store
public class ArrayListDemo {
	public static void main(String[] args) {
		//HashSet set = new HashSet();
		HashSet<Object> list = new HashSet<Object>();  // genric form 

		int x= 10;
		list.add(1000);  // by using add method
		list.add("s");
		list.add(100.50);
		list.add(new Integer(3000));
		list.add(500);
		list.add(100.50);
		
		System.out.println(list);
	}
}
