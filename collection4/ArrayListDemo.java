package collection4;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList<Employee>();

		Employee emp1 = new Employee(1001, "harsh", 55000);
		Employee emp2 = new Employee(1002, "neha", 53600);
		Employee emp3 = new Employee(1003, "sayalee", 43600);
		Employee emp4 = new Employee(1004, "nandini", 23600);

		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);

		Iterator<Employee> itr = list.iterator();
		while (itr.hasNext()) {
			Employee employee = itr.next();
			System.out.println(employee);
		}
	}

}
