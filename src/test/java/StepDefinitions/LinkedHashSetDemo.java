package StepDefinitions;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		
		LinkedHashSet lhs=new LinkedHashSet();
		//HashSet lhs=new HashSet(); 
		
		lhs.add(100);
		lhs.add(200);
		lhs.add(300);
		lhs.add(400);
		lhs.add(500);
		
		System.out.println(lhs);
		

	}

}
