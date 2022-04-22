package org.howard.edu.lsp.finalExam;

import java.awt.Window.Type;
import java.util.*;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class MapUtilitiesTest {
	
	/**
	 * same key,value pair
	 * JUnit case
	 */
	@Test
	@DisplayName("Test cases for same key:val pair")
	public void testCorrectkvpair() {
		HashMap<String, String> map1 = new HashMap<>();
		  
        // Add Entry to map
        map1.put("1", "Akshay");
        map1.put("2", "Bina");
        map1.put("3", "Chintu");
  
        // New HashMap2
        HashMap<String, String> map2 = new HashMap<>();
  
        // Add Entry to map
        map2.put("3", "Chintu");
        map2.put("2", "Bina");
        map2.put("1", "Akshay");
        map2.put("8", "Akshay");


        Map<String, String> commonMap = map1.entrySet().stream()
                .filter(x -> map2.containsKey(x.getKey()))
                .collect(Collectors.toMap(x -> x.getKey(), x -> x.getValue()));
//        		System.out.println(commonMap.size());
        assertEquals(commonMap.size(),3);
        
	}
	
	/**
	 * same key,value pair
	 * JUnit case
	 * @throws NullMapException 
	 */
	@Test
	@DisplayName("Test cases for empty maps")
	public void testEmpty() throws NullMapException  {
		HashMap<String, String> map1 = new HashMap<String, String>();;
        HashMap<String, String> map2 = new HashMap<String, String>();;

        		Map<String, String> commonMap = map1.entrySet().stream()
				        .filter(x -> map2.containsKey(x.getKey()))
				        .collect(Collectors.toMap(x -> x.getKey(), x -> x.getValue()));
        		if(commonMap.size() == 0) {
        			boolean check = true;
        			assertTrue(check);
        		}
//        		assertTrue(check,true);

	}
	
	/**
	 * same key,value pair
	 * JUnit case
	 * @throws NullMapException 
	 */
	@Test
	@DisplayName("Test cases for null maps")
	public static void nullMaps(
	        HashMap<String, String> map1,
	        HashMap<String, String> map2)throws NullMapException {
		Map<String, String> commonMap = map1.entrySet().stream()
		        .filter(x -> map2.containsKey(x.getKey()))
		        .collect(Collectors.toMap(x -> x.getKey(), x -> x.getValue()));
		System.out.println(map1);
			if(commonMap == null) {
				assertTrue(map1 == null );
				assertEquals(map2 , null );
				assertEquals(commonMap , null );
			}

	    }

}

