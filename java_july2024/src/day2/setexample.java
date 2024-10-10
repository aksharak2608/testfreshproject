package day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class setexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Set<String> a= new HashSet();

a.add("test");
a.add("abc");
a.add("xyz");

a.add("xy2z");
//a.clear();
System.out.println(a.contains("test"));
Iterator itr=a.iterator();
while(itr.hasNext())
{
	System.out.println(itr.next());
}



	}

}
