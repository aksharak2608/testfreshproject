package day2;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
test1 obj= new test1();
obj.add();
int c=obj.add(3,4);
System.out.println(c);


	}

	
	public void add()
	{
		System.out.println("parent add");
	}
	
	public void sub()
	{
		System.out.println("parent sub");
	}
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
	public int add(int a, short b)
	{
		System.out.println("add");
		return a+b;
	}
	
	
	
}
