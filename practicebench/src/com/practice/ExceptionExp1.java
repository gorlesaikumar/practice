package com.practice;

public class ExceptionExp1 {

	public static void main(String[] args)  {
		
		
		try {
			
			
			
			int a[]= new int[5];
			a[6]= 10;
			
		}
		
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		

	}

}
