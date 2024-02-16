package com.au.mafik;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

class Employee {
	String name;
	String gender;
	int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Employee(String name, String gender, int age) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}

}

public class StreamAPI {
	public static void main(String[] args) {
//filter all the female employee from given list;
		List<Employee> list = Arrays.asList(
				new Employee("Azam", "Male", 41), 
				new Employee("Payal", "Female", 33),
				new Employee("Yana", "Female", 42), 
				new Employee("Reza", "Male", 31));
		// list.stream().filter(emp ->
		// emp.getGender().equals("Female")).collect(Collectors.toList()).forEach(System.out::println);

		ListIterator<Employee> ltr = list.listIterator();
		while (ltr.hasNext()) {
		Employee employee = ltr.next();
		if (employee.getAge()>40) {
			ltr.add(employee);
		}
			
			}
			
		}
	}


