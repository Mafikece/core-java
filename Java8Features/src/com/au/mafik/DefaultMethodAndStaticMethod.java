package com.au.mafik;

interface A1{
	void m1();
	void m2();
	default void m3() {
		System.out.println("Addiding m() default method later");
	}
	static void m4() {
		System.out.println("Static m4() method");
	}
}

class B implements A1{
	@Override
	public void m1() {
		System.out.println("m1() implemented by B");
	}
	@Override
	public void m2() {
		System.out.println("m2() implemented by B");		
	}
}
class C implements A1{

	@Override
	public void m1() {
		System.out.println("m1() implemented by C");		
	}

	@Override
	public void m2() {
		System.out.println("m2() implemented by C");		
	}
	
	
}


public class DefaultMethodAndStaticMethod {

	public static void main(String[] args) {
		A1 a=new B();
		a.m1();
		a.m2();
		a.m3();
		A1.m4();
	}

}
