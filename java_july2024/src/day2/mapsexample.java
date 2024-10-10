package day2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class mapsexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map<Integer, String> test= new HashMap<Integer, String>();
test.put(1, "test");
test.put(2, "test2");
test.put(3, "test3");

Map<Integer, String> test1= new HashMap<Integer, String>();
test1.putAll(test);
System.out.println(test1);

Set<Integer> k=test.keySet();
System.out.println(test.get(2));
//for(int i=0;i<k.size();i++)
	for(int key:k)
	
{
	System.out.println("key value "+key);
}
	for(String v:test.values())
	{
		System.out.println(v);
	}

	}

}
