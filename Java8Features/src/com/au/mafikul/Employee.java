package com.au.mafikul;


	import java.util.Arrays;
	import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

	public class Employee {
		String name;
		String department;
		
		
		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public String getDepartment() {
			return department;
		}


		public void setDepartment(String department) {
			this.department = department;
		}
		

		public Employee(String name, String department) {
			super();
			this.name = name;
			this.department = department;
		}

		
		@Override
		public String toString() {
			return "Employee [name=" + name + ", department=" + department + "]";
		}


		public static void main(String[] args) {
			List<Employee> list=Arrays.asList(
					new Employee("John","IT"),
					new Employee("Rahul","Finance"),
					new Employee("Arun","HR"),
					new Employee("Zaid","Finance"),
					new Employee("John","IT"),
					new Employee("Mafik","Finance")
					);
			Map<String,List<Employee>> map = list.stream().collect(Collectors.groupingBy(Employee::getDepartment));
			map.forEach((department,employees)->{
				System.out.println(department);
				employees.forEach(System.out::println);
			});
			
			long count = list.stream().count();
		}

	}
