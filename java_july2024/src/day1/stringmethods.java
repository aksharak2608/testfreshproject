package day1;

public class stringmethods {

	public static void main(String[] args) {
		
		stringmethods obj= new stringmethods();
		obj.charindex(5);
		obj.testlength();
		String b=obj.testsubstring("test abc auto", 5);
		System.out.println(b);
		
		String c="test learn test automation using selenium";
		System.out.println(c.substring(3, 8));
		
		System.out.println(c.contains("automation"));
		System.out.println(c.equalsIgnoreCase("Learn Automation Using selenium"));
		System.out.println(c.equals("Learn automation using selenium"));
		System.out.println(c.concat(b));
		String[] result=c.split("learn");
		System.out.println(result.length);
		for(int i=0;i<=result.length-1;i++)
		{
			System.out.println(i);
			System.out.println(result[i]);
		}
		result=c.split("\\s");
		for(int i=0;i<=result.length-1;i++)
		{
			System.out.println(i);
			System.out.println(result[i]);
		}
		
		//System.out.println(c.split(c));
		
	}
	
	
	
	public String testsubstring(String a, int index)
	{
		
		String b= a.substring(index);
		return b;
		
	}
	
	
	public char charindex(int a)
	{
		char[] test= {'A', 'u', 't','o','m','a','t','i','o','n'};
		String t1="Test Automation abc testing";
		char b=t1.charAt(a);
		
		System.out.println(b);
		
		System.out.println(test[a]);
		System.out.println(test[3]);
		
		//sytax is string name ext1 above stringname.charAt(index);
		System.out.println(t1.charAt(2));
		
		
		return 0;
		
	}
	public char testlength()
	{
		char[] test= {'A', 'u', 't','o','m','a','t','i','o','n'};
		String t1="Test Automation abc testing";
	
		System.out.println(test.length);
		
		System.out.println(t1.length());
		
		
		return 0;
		
	}

}
