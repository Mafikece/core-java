package com.au.mafik;

@FunctionalInterface
interface A{
//	 void m(); 
	int add(int x , int y);
	
}
public class LamdaExpression {

	public static void main(String[] args) {
		A obj=(a,b)->{
			return a+b;
		};
		int result = obj.add(5, 10);
		System.out.println("Sum:"+ result);

	}

}
