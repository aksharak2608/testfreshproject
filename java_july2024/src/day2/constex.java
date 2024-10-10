package day2;

public class constex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		constex obj= new constex();
		constex obj1= new constex(4);
	}
	
	public  constex()
	{
		System.out.println("constructor called");
	}
	public  constex(int a)
	{
		System.out.println("constructor called"+a);
	}


}
