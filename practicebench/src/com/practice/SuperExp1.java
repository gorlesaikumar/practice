package com.practice;

class E
{
	
	int a= 10;
	void m1()
	{
		System.out.println("method from class C");
	}
}
class D extends E
{
	
	void m2()
	{
		
		super.m1();
		
		System.out.println("method from class D");
		System.out.println(super.a);
	}
}
public class SuperExp1 {

	public static void main(String[] args) {
		
		D a = new D();
	    a.m2();
	    
	    
	}

}
