package day1;

public class greatest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=7, b=7,c=1;
if(a>b&& a>c)
	System.out.println("a is the greates number");

if(b>c&&b>a)
	System.out.println("b is the greatest number");
if(c>a&&c>b)
	System.out.println("c is the greates number");
text();
	}

	
public static void greatest()
	{
		int a=3,b=4,c=4;
		
		if(a>=b)
		{
			if(a>b)
			{
				if(a>c)
				{
					System.out.println("a is greatest");
				}
				else 
				{
					System.out.println("c is greatest");
				}
			}
			else
			{
				System.out.println("a and b values are equal");
				if(a>c)
				{
					System.out.println("a is greates");
				}
				else
					System.out.println("c is greatest");
			}
		}
		else if(b>a)
		{
			if(b>=c)
			{
				if(b>c)
				{
					System.out.println("b is greatest");
				}
				else
					System.out.println("c is greatest");
				if(b==c)
					System.out.println("b and c values are same");
			}
		}
		
	}
	

public static void text()
{
	
	int a=15, b=16,c=16;
	if(a>=b && a>=c )
	{
System.out.println(a);
	}
	else if(b>=a &&b>=c)
	{
		System.out.println(b);
	}
	else
		System.out.println(c);

			
}
	
}
