package day2;

public class encap1 {
private int a, b;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int getsub()
	{
		return sub(a,b);
	}
	
	public void set(int a1, int b1)
	{
		this.a=a1;
		this.b=b1;
	}
	
	private int sub(int a, int b)
	{
		System.out.println("sub");
		
		return a-b;
	}
	
	
	
	private int add(int a, int b)
	{
		System.out.println("add");
		return a+b;
	}

}
