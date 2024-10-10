package day2;

import java.util.ArrayList;
import java.util.List;

public class listexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer> number= new ArrayList();
number.add(20);
number.add(30);
number.add(40);
List<Integer> na= new ArrayList();
System.out.println(number);
na.addAll(number);

na.add(2,45);
na.add(32);
na.add(52);

na.add(32);
na.add(52);
//na.removeAll(number);
//na.remove(2);

//na.removeIf(n->(n%2==0));

for(int i=0;i<na.size();i++)
{
	System.out.println(na.get(i));
}



	}

}
