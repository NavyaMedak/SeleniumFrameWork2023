package StepDefinitions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		//ArrayList al=new ArrayList(); storing hetro genious data like string, int, boolean
		//ArrayList<Integer> al=new ArrayList<Integer>(); //only stores integer
		//ArrayList<String> al=new ArrayLlist<String>();
		//List ls=new ArrayList();
		ArrayList al=new ArrayList();
		//Add the elements in ArrayList
		al.add("A");
		al.add("X");
		al.add("B");
		al.add("C");
		al.add("D");
		System.out.println(al);
		System.out.println(al.size()); //ArrayList index start with 1
        //al.remove(0);
        System.out.println(al);
        al.remove("welcome");
        System.out.println(al.size());
        System.out.println(al);
        //al.add(0,"Shivva");
        //al.add("Medak"); //add the element at last position
        System.out.println(al);
        System.out.println(al.get(4));
        //System.out.println(al.set(0, "false"));
        System.out.println(al);
        
        //for loop
       /* for(int i=0;i<al.size();i++)
        {
        	System.out.println(al.get(i));
        }*/
        
        //for each
        /*for(Object e:al)
        {
        	System.out.println("reading all the element using for each");
        	System.out.println(e);
        }*/
        //iteration()
        
        Iterator it=al.iterator();
        System.out.println("iteratior llop");
        while(it.hasNext()) //return true if it has elements then it move into loop
        {
        	System.out.println(it.next());
        }
        
        
        
        ArrayList al_dup=new ArrayList();
        al_dup.addAll(al);
        System.out.println(al_dup);
        
        Collections.sort(al);
        System.out.println(al);
        Collections.sort(al,Collections.reverseOrder());
        System.out.println(al);
        
        Collections.shuffle(al);
        System.out.println(al);
        
        
	}

}
