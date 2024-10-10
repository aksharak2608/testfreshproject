package day1;

public class laptopdetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
laptop obj= new laptop();
obj.readlaptopdetails();
obj.prinrdetails();
laptop.type="mac";
obj.memory=23;
System.out.println(laptop.type);
System.out.println(obj.memory);
laptop obj1= new laptop();
obj1.readlaptopdetails();
obj1.prinrdetails();
obj1.memory=8798;
System.out.println(obj1.memory);
System.out.println(laptop.type);


	}

}
