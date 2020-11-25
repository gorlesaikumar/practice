package com.practice;

class animals
{
	void eat()
	{
		System.out.println("dogs eat");
	}
}
class cat extends animals
{
	void eat()
	{
		System.out.println("cats drink milk");
	}
}
public class DynamicBindingexp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       animals c = new cat();
       c.eat();
	}

}
