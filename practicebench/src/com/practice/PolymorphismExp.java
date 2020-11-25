package com.practice;

class adder
{
	static int  add(int a , int b)
	{
		return a+b;
	}
	static int add(int a , int b , int c)
	{
		return a+b+c;
	}
	
	static double add(double a , double b)
	{
		return a+b;
	}
}

public class PolymorphismExp {

	public static void main(String[] args) {
		
		System.out.println(adder.add(10, 20));
		System.out.println(adder.add(10.5, 20));
		

	}

}
