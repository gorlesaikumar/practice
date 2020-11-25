package com.practice;

class animal
{
	void eat()
	{
		System.out.println("animals eat");
	}
}
class dog extends animal
{
	void bark()
	{
		System.out.println("dogs bark");
	}
}
public class IneritanceExp1 {

	public static void main(String[] args) {
		
		dog d = new dog();
		d.eat();
		d.bark();
		

	}

}
