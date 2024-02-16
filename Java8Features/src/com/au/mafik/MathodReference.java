package com.au.mafik;

@FunctionalInterface
interface Demo {
	int add(int a, int b);
}

class Calculate {
	public int addition(int x, int y) {
		System.out.println("Using logic from addition menthod of calcuate class ");
		return (x + y);
	}
}

public class MathodReference {

	public static void main(String[] args) {
		Demo demo=new Calculate()::addition;
		int sum = demo.add(10,20);
		System.out.println(sum);
			
		
	}

}
