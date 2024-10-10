package day2;

public class abst2 extends testabstr{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	testabstr obj= new testabstr();
		abst2 obj= new abst2();
		int c=obj.add(5, 6);
		System.out.println(c);
		c=obj.sub(5, 3);
		System.out.println(c);
		obj.t1();
	}

	@Override
	void t1() {
		// TODO Auto-generated method stub
		System.out.println("t1");
	}

	@Override
	void t2(int a) {
		// TODO Auto-generated method stub
		System.out.println("t2");
	}

}
