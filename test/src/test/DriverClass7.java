package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DriverClass7 {
	public static void main(String[] args) 
	{
		List<String> resultList = new ArrayList<>();
		Map<String,String> map=new HashMap<>();
		
		map.put("Borehole","");
		map.put("Logging_Job","Borehole");
		map.put("VSP_Survey","Logging_Job");
		map.put("Seismic_Line","VSP_Survey");
		map.put("Seismic_Dataset","Seismic_Line");
		map.put("Seismic_File","Seismic_Dataset");
		map.put("PSL_Header_Template","Seismic_Dataset");
		map.put("PSL_Header_Element","PSL_Header_Template");
		map.put("Coordinate_System","VSP_Survey");
		map.put("Borehole","");

//		Map<String, String> nameMap = new HashMap<>();
//		nameMap.put("test1", "");
//	    nameMap.put("test2", "testParent1");
//	    nameMap.put("test3", "testParent1");
//	    nameMap.put("test4", "testPatent2");
//	    nameMap.put("test5", "test4");
	   

	    List<String> output = new ArrayList<>();
	    for (String key : map.keySet()) {
	        if (map.get(key)==null || map.get(key).isEmpty()) {
	            output.add("/" + key);
	        } else {
	            output.add(getPath(key, map));
	        }
	    }
	    System.out.println(output.size());
	    for(String result: output) {
	    	System.out.println(result);
	    }
	}

	private static String getPath(String key, Map<String, String> nameMap) {
	    String parent = nameMap.get(key);
	    if (parent==null || parent.isEmpty()) {
	        return "/" + key;
	    } else {
	        return getPath(parent, nameMap) + "/" + key;
	    }
	}
}
