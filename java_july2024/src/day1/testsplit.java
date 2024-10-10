package day1;

public class testsplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String a="hellow |c world welcome to automation";
 String[] r=a.split("\\s",3);
 for(int i=0;i<=r.length-1;++i)
 {
	 System.out.println(i);
	 System.out.println(r[i]);
 }
 
 String finalresult=r[1];
	}

}
