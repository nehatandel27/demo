package collection4;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemo2 {
	public static void printall(ArrayList<Employee> list) {

		Iterator<Employee> itr = list.iterator();
		while (itr.hasNext()) {// next element is theree or not if true

			Employee employee = itr.next();// next available object of emplo; actual element retrieve

			System.out.println(employee.getEmployeeId() + "," + employee.getEmployeeName() + "," + employee.getEmployeeSalary());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> list = new ArrayList<Employee>();

		Employee emp1 = new Employee(1001, "harsh", 55555);
		Employee emp2 = new Employee(1002, "sonia", 222);
		Employee emp3 = new Employee(1003, "neha", 999);
		Employee emp4 = new Employee(1004, "mira", 8888);

		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		System.out.println("before sorting");
		printall(list);
		Collections.sort(list);
		System.out.println("after sorting");

		printall(list);
//camparetor 
		Collections.sort(list, new EmployeeIdSorter());
		System.out.println("After sorting on basis of id: ");
		printall(list);   
	}

}
