package Pkg_B;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class HashSet_Problem {

	public static void main(String[] args) {
		
		List<String> arr= new ArrayList<>();
		arr.add("Hakoola");		arr.add("Hakoola2");		arr.add("Hakoola3");		arr.add("Hakoola4");
		
		
		
	    HashSet<String> set=new HashSet<String>(arr);  
        set.add("1One");    
        set.add("Two");    
        set.add("Three");   
        set.add("Four");  
        set.add("Five");
        set.remove("Two");
       //set.removeAll(arr);
         //System.out.println( set.equals("Hakoola2")); 
        //arr.set(0, "changed");
     //   arr.set(0, "Hakoola");
        System.out.println(  arr.subList(0, 2));
        List<String> list = new ArrayList<String>(set); 
        Collections.sort(list); 
        System.out.println("List is here: "+list);
        
        Iterator<String> i=set.iterator();  
       
        while(i.hasNext())  
        {  
        System.out.println(i.next());  
        }   
//        Iterator<String> i1=arr.iterator(); 
//        while(i1.hasNext())  
//        {  
//        System.out.println(i1.next());  
//        }   
		
		
		

	}

}
