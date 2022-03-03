package org.howard.edu.lsp.assignment5.test;
import org.howard.edu.lsp.assignment5.implementation.IntegerSet;
import org.howard.edu.lsp.assignment5.implementation.IntegerSetException;

import java.util.*;


public class Driver {

 public static void main(String[] args) {
    
ArrayList<Integer> list1= new ArrayList<>();
ArrayList<Integer> list2= new ArrayList<>();

/**
  *make 2 instance of integerset class for implementation
 */
IntegerSet set1= new IntegerSet(list1);
IntegerSet set2= new IntegerSet(list2);

set1.add(1);
set1.add(3);
set1.add(4);
set1.add(6);
set1.add(3);
set1.add(9);
set1.add(7);

set2.add(1);
set2.add(2);
set2.add(3);
set2.add(4);
set2.add(5);
set2.add(6);
set2.add(7);
set2.remove(5);
System.out.println("Set 1 : "+set1.getlist());
System.out.println("Set 2 : "+set2.getlist());

System.out.println("Is equal : "+set1.equals(set2));

try {
	System.out.println("Largest element in set1 : "+set1.largestelement());
} catch (IntegerSetException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

try {
	System.out.println("Smallest element in set2 : "+set2.smallestelement());
} catch (IntegerSetException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

IntegerSet setu= set1.union(set2);

System.out.println("Union : "+setu.getlist() );

IntegerSet seti= set1.intersection(set2);

System.out.println("Intersection : "+seti.getlist() );


    
 }

}
