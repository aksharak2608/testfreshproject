package day2;

public class arraytest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []rollno;
rollno= new int[5];
//arraytest obj= new arraytest();
//rollno[]= {1,2,3,4,5};
rollno[0]=1;
rollno[1]=2;
rollno[2]=1;
rollno[3]=2;
rollno[4]=2;
for(int i=0;i<rollno.length;i++)
{
	System.out.println(rollno[i]);
}
int b[][]= {{6,9,7},{3,5,6},{9,4,5}};
int c[][]= {{6,4,7},{3,2,6},{9,5,5}};
for(int i=0;i<b.length;i++)
{
	for(int j=0;j<b[i].length;j++)
	{
		int r=0;
		r=b[i][j]+c[i][j];
		System.out.print(" "+r);
	}
	System.out.println();
}








	}

}
