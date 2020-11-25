package com.practice;

interface painting
{
	void draw();
}

class A1 implements painting
{
	public void draw()
	{
		System.out.println(" landscape ");
	}
}

class A2 implements painting
{
	public void draw()
	{
		System.out.println(" picture ");
	}
}

 class art
{
	public static void main (String args[])
	{
		painting p = new A1();
		p.draw();
	}
}