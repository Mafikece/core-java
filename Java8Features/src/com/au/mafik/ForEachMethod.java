package com.au.mafik;

import java.beans.Expression;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForEachMethod {

	public static void main(String[] args) {
		List<String> name=Arrays.asList("Arun","Zaid","Johny","Mafik");
		System.out.println("=========For each loop");
		for (String n : name) {
			System.out.println(n);
		}
		
		System.out.println("=========ForEach() menthod========");
		name.forEach((name1)->{System.out.println(name1);});
		
		System.out.println("========using System method Reference=========");
		name.forEach(System.out::println);
		
		
		System.out.println("=====usining lamda Expression====");
		ArrayList al=new ArrayList();
		al.add("Rahim");
		al.add(23);
		al.add(25000.0);
		al.forEach(data->System.out.println(data));
		System.out.println("===========using method reference======");
		al.forEach(System.out::println);
		}
	
		
	}


