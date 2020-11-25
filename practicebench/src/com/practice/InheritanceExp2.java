package com.practice;

class A
{
	void eat()
	{
		System.out.println(" eating from class a");
	
	}
	
}
class B extends A
{
	void drink()
	{
		System.out.println(" drinking from class b");
	}
}
class C extends B
{
	void sleep()
	{
		System.out.println(" sleeping from class c");
	}
}
public class InheritanceExp2 {

	public static void main(String[] args) {
		
		C c = new C();
		c.eat();
		c.drink();
		c.sleep();
		

	}

}
