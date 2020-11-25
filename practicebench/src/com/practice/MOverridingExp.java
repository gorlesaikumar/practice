package com.practice;

class Bank
{
	void run()
	{
		System.out.println("rate of intrest 0");
	}
}

class Sbi extends Bank
{
	void run()
	{
		System.out.println(" intrest 5");
	}
}

class Hdfc extends Bank
{
	void run()
	{
		System.out.println(" intrest 12");
	}
}
public class MOverridingExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hdfc h = new Hdfc();
		Sbi s = new Sbi();
		
		s.run();
		h.run();
		
	}

}
