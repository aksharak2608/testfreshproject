package day1;

public class testsring3 {
	public static void main(String args[])
	{
		 String a="hellow |c world welcome to automation";
		 System.out.println(a.indexOf("|"));
		 String b=a.replace(" |", " c");
		 System.out.println(b);
		 String c="   hellow are you there hellow are you there           ";
		 System.out.println(c.indexOf("hellow",2));
		 String d=c.toUpperCase();
		 System.out.println(d);
		 System.out.println(d.toLowerCase());
		 System.out.println(c.trim());
		 
		 
	}

}
