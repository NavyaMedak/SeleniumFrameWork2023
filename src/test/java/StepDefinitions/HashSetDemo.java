package StepDefinitions;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		
		//HashSet hs=new HashSet(100); //Capacity initiaed with 100
		
		//HashSet ha=new HashSet(100,(float)0.75); //capacity with Load factor is 0.75
		
		//HashSet<Integer> hs1=new HashSet<Integer>(); //Homegenious data
		
		//HashSet<Object> Obj=new HashSet<Object>(); // Hetrogenious data
		
		HashSet hs=new HashSet(); // Default capacity with 16 and Loadfactor is 0.57
		//Add Object into Hashset
		
		hs.add(100);
		hs.add("Welcome");
		hs.add(16.4);
		hs.add('A');
		hs.add(null);
		
		System.out.println(hs); //Insertion order is not preserved
		
		hs.remove(null);
		System.out.println(hs.contains("welcome"));
		System.out.println(hs);
		System.out.println(hs.isEmpty());
		
		//Reading the elements from hashset using for..each
		
		/*for(Object e:hs)
		{
			System.out.println(e);
		}*/
		
		Iterator it=hs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
