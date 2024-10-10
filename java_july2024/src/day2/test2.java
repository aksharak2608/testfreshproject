package day2;

public class test2 extends test1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
test2 obj= new test2();
obj.add();
obj.divide();
obj.multip();


	}
	public void add()
	{
		System.out.println("child add");
		super.add();
	}
	
	public void sub()
	{
		System.out.println("child sub");
	}
	
	public void multip() {
		System.out.println("multiply");
		super.add();
		this.divide();
	}
	public void divide()
	{
		System.out.println("divide");
	}

}
