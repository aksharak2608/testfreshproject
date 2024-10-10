package day2;

public abstract class testabstr {

	abstract void t1();
	abstract void t2(int a);
	
	public int sub(int a, int b)
	{
		System.out.println("sub");
		return a-b;
	}
	
	public int add(int a, int b)
	{
		System.out.println("add");
		return a+b;
	}

}
