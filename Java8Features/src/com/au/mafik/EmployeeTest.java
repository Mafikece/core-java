package com.au.mafik;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

class EmployeeDetails{
	String eNameString;
	int eSalary;
	int eAge;
	public String geteNameString() {
		return eNameString;
	}
	public void seteNameString(String eNameString) {
		this.eNameString = eNameString;
	}
	public int geteSalary() {
		return eSalary;
	}
	public void seteSalary(int eSalary) {
		this.eSalary = eSalary;
	}
	public int geteAge() {
		return eAge;
	}
	public void seteAge(int eAge) {
		this.eAge = eAge;
	}
	@Override
	public String toString() {
		return "EmployeeDetails [eNameString=" + eNameString + ", eSalary=" + eSalary + ", eAge=" + eAge + "]";
	}
	public EmployeeDetails(String eNameString, int eSalary, int eAge) {
		super();
		this.eNameString = eNameString;
		this.eSalary = eSalary;
		this.eAge = eAge;
	}
	public EmployeeDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
public class EmployeeTest {

	public static void main(String[] args) {
		List<EmployeeDetails> el = Arrays.asList(
				new EmployeeDetails("Harsh",50000,55),
				new EmployeeDetails("Johny",40000,22),
				new EmployeeDetails("Arun",35000,20));
				System.out.println(el);
							
				ListIterator<EmployeeDetails> l=el.listIterator();
				while (l.hasNext()) {
					EmployeeDetails e = (EmployeeDetails) l.next();
					
					if (e.geteAge()>=40) {
						l.add(e);
						System.out.println(l);
						
					}
				}
	}

}
