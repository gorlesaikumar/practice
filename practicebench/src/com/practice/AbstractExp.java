package com.practice;


	
	abstract class one
	{
		  abstract void m1();
	}
	
	abstract class two
	{
		abstract void m2();
	}
	
	class three extends one
	{
		void m1()
		{
			System.out.println(" abstract method one");
		}
		
	}
	public class AbstractExp {
	public static void main(String[] args) {
		three t = new three();
		t.m1();
		
		}

}
