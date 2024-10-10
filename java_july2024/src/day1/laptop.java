package day1;

import java.util.Scanner;

public class laptop {
	
	
	int memory;
	int screensize;
	String processor;
	static String type;
	public void readlaptopdetails()
	{
		Scanner scn= new Scanner(System.in);
		System.out.println("enter the memory size");
	memory=scn.nextInt();
	System.out.println("enter the screen size");
	screensize=scn.nextInt();
	System.out.println("enter the processor");
	processor=scn.next();
	System.out.println("enter the type");
	type=scn.next();
	System.out.println("Details captured.");
//	scn.close();
	}
	
	public void prinrdetails()
	{
		System.out.println("memory of the laptop is "+memory);
		System.out.println("screensize of the laptop is "+screensize);
		System.out.println("processor of the laptop is "+processor);
		System.out.println("type of the laptop is "+type);
	} 
	public laptop()
	{
		System.out.println("laptop object constructor created.125");
	}
	
	

}
