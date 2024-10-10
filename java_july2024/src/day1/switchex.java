package day1;

public class switchex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int day=256;
switch(day%7)
{
case 1:
System.out.println("sunday");
break;
case 2 :
	System.out.println("Monday");
	break;
case 3:
	System.out.println("tuesday");
	break;
case 4:
System.out.println("wednesday");
break;
case 5 :
	System.out.println("thursday");
	break;
case 6:
	System.out.println("friday");
	break;
case 7:
	System.out.println("saturday");
	break;
	default: 
		System.out.println("invalid input");
}


for(int i=day;i>5;)
{
	
	
	i++;
}
int i=2;


while(i>2)
{
	System.out.println(i);
	i++;
	
}
int j=2;
do {
	System.out.println(j);
}while(j>2);





	}

}
