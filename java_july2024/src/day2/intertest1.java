package day2;

public class intertest1 extends abst2 implements interfacetest, interfacetest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		intertest1 obj= new intertest1();
		obj.testinf2(a);
	}

	@Override
	public void testinf() {
		// TODO Auto-generated method stub
		System.out.println("testinf");
	}

	@Override
	public void testinf2(int a) {
		// TODO Auto-generated method stub
		System.out.println("testinf2"+a); 
	}

	@Override
	public void testinf3() {
		// TODO Auto-generated method stub
		System.out.println("testinf3"); 
	}

	@Override
	public void testinf4(int a) {
		// TODO Auto-generated method stub
		System.out.println("testinf2"+a); 
	}

}
