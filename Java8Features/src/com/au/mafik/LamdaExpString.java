package com.au.mafik;

interface Speak{
	public String sayName(String name);
}

public class LamdaExpString {

	public static void main(String[] args) {
		Speak s=(name)->{
			return "hello, "+name;
		};
		String name = s.sayName("Mafik");
		System.out.println(name);
	}
 
}
