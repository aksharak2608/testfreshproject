package day1;

public class test {
int d=9;
static int  s=8;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("helow welcome");

int a,b;

a=6;
b=10;

test obj= new test();
System.out.println(obj.d);
System.out.println(s);
int c=obj.add(6, 7);
System.out.println(" sum of a and b value is"+c);
c=obj.add(8, 9);
System.out.println(" sum of a and b value is"+c);
obj.d=9;
double s1=23.2;
System.out.println(" sum of a and b value is"+add(4,5));
char a1[]={'b','y','u','q','w','e'};
String abc="asdasddasd";
char b1='c';
obj.withreturnandparameters(a1,b1);
boolean a31=true;
	}
	
	
	public static int add(int a, int b)
	{
		int c=a+b;
		System.out.println(" a value is"+a);
		System.out.println(" b value is"+b);
		//System.out.println(" sum of a and b value is"+c);
		System.out.println(s);
		return c;
	}

	
	
	public String withreturnandparameters(char[] a, char b) {
		String c = "";
		for(int i=0;i<a.length;i++)
		{
		c=c+a[i];
		}
		System.out.println(c);
		c=c+b;
		System.out.println(c); 
		System.out.println(d);
		return c;
	}
	
	
	
	
	
}
