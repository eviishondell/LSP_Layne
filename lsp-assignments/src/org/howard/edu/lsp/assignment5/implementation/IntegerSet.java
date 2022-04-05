package org.howard.edu.lsp.assignment5.implementation;

import static org.junit.Assert.assertEquals;

import java.util.*;
/**
*@author eviishondell
*/

public class IntegerSet{

 private ArrayList<Integer> list= new ArrayList<>();

 public IntegerSet(ArrayList list) {
     this.list=list;
 }


/** 
*  Clears the all representation of class
*/  
 public void clear() {
     list.clear();
 }

/**   
* Returns the length of set
*/
 public int length() {
     return list.size();
 }

/**   
* return true if 2 lists are equal
*/
 public boolean equals(IntegerSet b) {
    
     ArrayList<Integer> list2=b.list;
       
     if(list.size()!=list2.size()) {
         return false;
     }
       
     ArrayList<Integer> temp1=list;
       
     ArrayList<Integer> temp2=list2;
       
     Collections.sort(temp1);
     Collections.sort(temp2);
       
     for(int i=0;i<temp1.size();i++) {
         if(temp1.get(i)!=temp2.get(i)) {
             return false;
         }
     }
       
     return true;
    
 }

/**
  *returns a largest item and throw exception if list is empty
 */
 public int largestelement() throws IntegerSetException {
     
     if(list.size()==0) {
    	 IntegerSetException e= new IntegerSetException();
         throw e;
     }
     
     int max=0;
     
     for(int i=0;i<list.size();i++) {
         if(list.get(i)>max) {
             max=list.get(i);
         }
     }
     
     return max;
     
 }
/**
  *returns a largest item and throw exception if list is empty
 */
 public int smallestelement() throws IntegerSetException {// throws  Listemptyexception {
    
     if(list.size()==0) {
         IntegerSetException e= new IntegerSetException();
         throw e;
     }
    
     int min=Integer.MAX_VALUE;
    
     for(int i=0;i<list.size();i++) {
         if(list.get(i)<min) {
             min=list.get(i);
         }
     }
    
     return min;
    
 }
/**
  * add item if already not exist in list
 */
 public void add(int item ) {
    
     boolean there=false;
    
     for(int i=0;i<list.size();i++) {
        
         if(list.get(i)==item) {
             there=true;
         }
     }
    
     if(there==false) {
         list.add(item);
     }
    
 }
/**
  *remove item if already not exist in list
 */
 public void remove(int item ) {
    
    
    
     for(int i=0;i<list.size();i++) {
        
         if(list.get(i)==item) {
             list.remove(i);
         }
     }
    
 }
 /**
 * toString
 * JUnit case
 */
// @Test
// @DisplayName("Test cases for tostring")
 public String testtoString() {
 ArrayList<Integer> list_one = new ArrayList<>(); 
 IntegerSet setA = new IntegerSet(list_one);
 return this.list.toString();

// setA.add(13);
// setA.add(4);
// setA.add(88);
// setA.add(2);
// setA.add(60);
// setA.add(6);
//
// String example = "[13, 4, 88, 2, 60, 6]";
// String str = setA.toString();
//
// System.out.println(setA.toString());
// System.out.println(example);
// assertEquals(example, setA.toString());
// setA.clear();
 }

/**
 * return union of of 2 sets
 * 
 * @param list2
 * @return list 4
 */
 public IntegerSet union(IntegerSet list2) {
    
     ArrayList<Integer> temp=list2.getlist();
    
     Set<Integer> set = new HashSet<>();
     set.addAll(list);
     set.addAll(temp);
    
     ArrayList<Integer> list3= new ArrayList<>(set);
    
     IntegerSet list4= new IntegerSet(list3);
    
     return list4;
    
 }

/**
 * return intersection of of 2 sets 
 * @param list2
 * @return list
 */
 public IntegerSet intersection(IntegerSet list2) {
    
     ArrayList<Integer> temp=list2.getlist();
    
     list.retainAll(temp);
    
IntegerSet list4= new IntegerSet(list);
    
     return list4;
 }

/**
 * returns difference of 2 sets
 * 
 * @param list2
 * @return list4
 */
 public IntegerSet difference (IntegerSet list2) {
    
     ArrayList<Integer> temp=list2.getlist();
    
     // Remove all elements in list2 from list
     list.removeAll(temp);
    
IntegerSet list4= new IntegerSet(list);
    
     return list4;
    
 }

 public ArrayList<Integer> getlist(){
     return list;
 }


public boolean contains(int i) {
	// TODO Auto-generated method stub
	return null != null;
}


}
