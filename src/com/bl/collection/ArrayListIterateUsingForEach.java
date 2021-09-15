package com.bl.collection;

import java.util.ArrayList;

public class ArrayListIterateUsingForEach {

	 public static void main(String args[]) {
	        // initialize ArrayList  
	        ArrayList<Integer> al = new ArrayList<Integer>();
	        // add elements to ArrayList object
	        al.add(3);
	        al.add(17);
	        al.add(6);
	        al.add(9);
	        al.add(7);
	        System.out.println("Using Advanced For Loop or for each loop");   
	        // printing ArrayList 
	        for (Integer num : al) {         
	            System.out.println(num);   
	        }
	    }
}
