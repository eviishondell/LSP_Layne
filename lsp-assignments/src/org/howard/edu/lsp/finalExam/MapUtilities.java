package org.howard.edu.lsp.finalExam;
import java.util.*;
import java.util.stream.Collectors;



public class MapUtilities {
	public static int commonKeyValuePairs( 
			HashMap<String, String> map1,
	        HashMap<String, String> map2)throws NullMapException {
		if(map1==null || map2==null) {
			NullMapException e= new NullMapException();
	         throw e;
		}
        Map<String, String> commonMap = map1.entrySet().stream()
                .filter(x -> map2.containsKey(x.getKey()))
                .collect(Collectors.toMap(x -> x.getKey(), x -> x.getValue()));
        		
        		return commonMap.size();


	}

}

