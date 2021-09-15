package com.bl.collection;

import java.util.*;

public class ArrayListContainsExample {
    public static void main(String args[]) {
        // initialize ArrayList  
        ArrayList<Integer> al = new ArrayList<Integer>();
        // add elements to ArrayList object
        al.add(3);
        al.add(17);
        al.add(6);
        al.add(9);
        al.add(7);
        // check if ArrayList contains element
        if (al.contains(20)) {
            System.out.println("the element you enter is in the list");
        } else {
            System.out.println("the element you have enter is not in the list");
        }
    }
}