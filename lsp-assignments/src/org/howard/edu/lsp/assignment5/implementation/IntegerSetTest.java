package org.howard.edu.lsp.assignment5.implementation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
//import IntegerSet;
//import IntegerSetException;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.Assert.assertTrue;
//import org.howard.edu.lsp.assignment5.integerset.IntegerSet;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

/**
 * @author 
 * Evolone Layne
 */
public class IntegerSetTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}

	
	/**
	 * Add
	 * JUnit case
	 */
	@Test
	@DisplayName("Test cases for add")
	public void testAdd() {
		ArrayList<Integer> list_one = new ArrayList<>();		
		IntegerSet setA = new IntegerSet(list_one);
		
		setA.add(0);		
		assertEquals(true, setA.contains(0));
		setA.clear();
	}
	
	
	/**
	 * Remove
	 * JUnit case
	 */
	@Test
	@DisplayName("Test cases for remove")
	public void testRemove() {
		ArrayList<Integer> list_one = new ArrayList<>();		
		IntegerSet setA = new IntegerSet(list_one);
		
		//setA = {0, 10, 20}
		setA.add(0);
		setA.add(10);
		setA.add(20);
		
		setA.remove(0);
		
		assertEquals(false, setA.contains(0));
		setA.clear();
	}
	
	
	/**
	 * Length
	 * JUnit case
	 */
	@Test
	@DisplayName("Test cases for length")
	public void testLength() {
		ArrayList<Integer> list_one = new ArrayList<>();		
		IntegerSet setA = new IntegerSet(list_one);
		
		//setA = {5, 57, 1, 2, 33}
		setA.add(5);
		setA.add(57);
		setA.add(1);
		setA.add(2);
		setA.add(33);
		assertEquals(5, setA.length());
		setA.clear();
		
		//Length if 0 is the only element
		setA.add(0);
		assertEquals(1, setA.length());
		setA.clear();
		
		//Length of an empty set
		assertEquals(0, setA.length());
		setA.clear();
	}
	
	
	/**
	 * IsEmpty
	 * JUnit case
	 */
	@Test
	@DisplayName("Test cases for is empty")
	public void testIsEmpty() {
		ArrayList<Integer> list_one = new ArrayList<>();		
		IntegerSet setA = new IntegerSet(list_one);
		
		//Checks if setA is empty (while empty)
		if (setA.length() == 0){
			boolean check = true;
		
		assertEquals(true, check);
		
		//Checks if setA is empty (while not empty)
		setA.add(9);
		assertEquals(false, check);
		setA.clear();
		}
	}
	
	


	/**
//	 * Contains
//	 * JUnit case
//	 */
	@Test
	@DisplayName("Test cases for contains")
	public void testContains() {
		ArrayList<Integer> list_one = new ArrayList<>();
		IntegerSet setA = new IntegerSet(list_one);
		
		setA.add(51);
		setA.add(6);
		setA.add(44);
		setA.add(27);
		setA.add(13);
		
		assertEquals(true, setA.contains(5));
		setA.clear();
	}
	
	
	/**
	 * Clear
	 * JUnit case
	 */
	@Test
	@DisplayName("Test cases for clear")
	public void testClear() {
		ArrayList<Integer> list_one = new ArrayList<>();
		
		IntegerSet setA = new IntegerSet(list_one);
		
		//setA = {2, 5, 6}
		setA.add(2);
		setA.add(5);
		setA.add(6);
		
		//clear setA
		setA.clear();
		
		//check if clear
		assertEquals(true, setA.length() == 0);
	}
	
		
	/**
	 * Equals
	 * JUnit Test
	 */
	@Test
	@DisplayName("Test cases for equals")
	void testEquals() {
		ArrayList<Integer> list_one = new ArrayList<>();
		ArrayList<Integer> list_two = new ArrayList<>();
		
		IntegerSet setA = new IntegerSet(list_one);
		IntegerSet setB = new IntegerSet(list_two);
		
		
		//If both sets are equal		
		setA.add(2);
		setA.add(5);
		setA.add(6);
		
		setB.add(6);
		setB.add(5);
		setB.add(2);
		
		assertEquals(true, setA.equals(setB)); //True if setA == setB
		setA.clear();
		setB.clear();
		
		
		//If one set is != to the other
		setA.add(2);
		setA.add(5);
		setA.add(6);
		
		setB.add(6);
		setB.add(5);
		
		assertEquals(false, setA.equals(setB)); //True if setA != setB
		setA.clear();
		setB.clear();
		
		
		//If set overlap exists
		setA.add(2);
		setA.add(6);
		
		setB.add(6);
		setB.add(5);
		
		assertEquals(false, setA.equals(setB)); //True if setA != setB
		setA.clear();
		setB.clear();
	}
	
	
	/**
	 * Union
	 * JUnit Test
	 */
	@Test
	@DisplayName("Test cases for union")
	void testUnion() {
		ArrayList<Integer> actually = new ArrayList<>();
		IntegerSet three = new IntegerSet(actually);	
		
		ArrayList<Integer> list_one = new ArrayList<>();
		ArrayList<Integer> list_two = new ArrayList<>();
		
		IntegerSet setA = new IntegerSet(list_one);
		IntegerSet setB = new IntegerSet(list_two);
		
		
		
		//If both sets are equal
		//setA = {2, 5}
		setA.add(2);
		setA.add(5);
		setA.add(6);
		
		//setB = {13, 4}
		setB.add(13);
		setB.add(4);

		
		//setA U setB = {2, 6}
		three.add(2);
		three.add(4);
		three.add(5);
		three.add(6);
		three.add(13);
		
//		setA.union(setB);
//		System.out.println(three);
//		System.out.println(setA.union(setB).getClass());
//		setA.union(setB);
		assertEquals(setA.union(setA).getClass(),setA.union(three).getClass()); //True if setA == setB
		setA.clear();
		//NOT FINISHED
		
	}
	
	
	/**
	 * Intersect
	 * JUnit Case
	 */
	@Test
	@DisplayName("Test cases for intersection")
	public void testIntersect() {
		ArrayList<Integer> actually = new ArrayList<>();
		IntegerSet three = new IntegerSet(actually);		
		
		ArrayList<Integer> list_one = new ArrayList<>();
		ArrayList<Integer> list_two = new ArrayList<>();
		
		IntegerSet setA = new IntegerSet(list_one);
		IntegerSet setB = new IntegerSet(list_two);
		
		//setA = {2, 5, 6}
		setA.add(2);
		setA.add(5);
		setA.add(6);
		
		//setA = {6, 5}
		setB.add(6);
		setB.add(5);
		
        //three = {5, 6}
		three.add(6);
		three.add(5);
//		System.out.println(setA);
//		System.out.println(setB);
		System.out.println(three);
		System.out.println(setB.intersection(setA));
//		setA.intersection(setB);
		assertEquals(three, setB.intersection(setA));
		}
	
	/**
	 * Difference
	 * JUnit Test
	 */
	@Test 
	@DisplayName("Test cases for difference")
	void testDiff() {
		ArrayList<Integer> actually = new ArrayList<>();
		IntegerSet three = new IntegerSet(actually);
		ArrayList<Integer> list_three = new ArrayList<>();
		ArrayList<Integer> list_one = new ArrayList<>();
		ArrayList<Integer> list_two = new ArrayList<>();

		IntegerSet setA = new IntegerSet(list_one);
		IntegerSet setB = new IntegerSet(list_two);

 
		//setA = {2, 5, 6}
		setA.add(2);
		setA.add(5);
		setA.add(6);

		//setB = {13, 4, 88, 2, 60, 6}
		setB.add(13);
		setB.add(4);
		setB.add(88);
		setB.add(2);
		setB.add(60);
		setB.add(6);

		//setA - setB = {5}
		three.add(2);
		three.add(6);
//		setA.difference(setB);
		System.out.println(three);
		System.out.println(setA.intersection(setB));
		assertEquals(setA.intersection(setB).getClass(), setA.intersection(setB).getClass());
		setA.clear();
		
	}
	
	/**
	 * toString
	 * JUnit case
	 */
	@Test
	@DisplayName("Test cases for tostring")
	public void testtoString() {
		ArrayList<Integer> list_one = new ArrayList<>();		
		IntegerSet setA = new IntegerSet(list_one);
		
		setA.add(13);
		setA.add(4);
		setA.add(88);
		setA.add(2);
		setA.add(60);
		setA.add(6);
		
		String example = "13, 4, 88, 2, 60, 6";
		System.out.println(setA.toString());
		System.out.println(example);
		assertEquals(true, example == setA.toString());
		setA.clear();
	}
	
	
	/**
	 * Largest
	 * JUnit case
	 */
	@Test
	@DisplayName("Test cases for largest")
	public void testlargestExceptionSucceeds() {
		ArrayList<Integer> list_one = new ArrayList<>();		
		IntegerSet setA = new IntegerSet(list_one);
		
		int max_order;
		
		setA.add(13);
		setA.add(4);
		setA.add(88);
		setA.add(2);
		setA.add(60);
		setA.add(6);
		
		max_order = 88;
		
		
		try {
		try {
			assertEquals(true, max_order == setA.largestelement());
		} catch (org.howard.edu.lsp.assignment5.implementation.IntegerSetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		finally {
			
		}
		setA.clear();
	}
	
	/**
	 * Smallest
	 * JUnit case
	 */
	@Test
	@DisplayName("Test cases for smallest")
	public void testsmallestExceptionSucceeds() {
		ArrayList<Integer> list_one = new ArrayList<>();		
		IntegerSet setA = new IntegerSet(list_one);
		
		int min_order;
		
		setA.add(13);
		setA.add(4);
		setA.add(88);
		setA.add(2);
		setA.add(60);
		setA.add(6);
		
		min_order = 2;
		
		
		try {
		try {
			assertEquals(true, min_order == setA.largestelement());
		} catch (org.howard.edu.lsp.assignment5.implementation.IntegerSetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		finally {
			
		}
		setA.clear();
	}
}
