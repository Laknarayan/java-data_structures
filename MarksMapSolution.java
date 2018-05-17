package com.samples.one;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MarksMapSolution {

	public static void main(String[] args) {
		
		Map<Integer,String> marksMap = new LinkedHashMap<Integer,String>(10);
		marksMap.put(100,"A");
		marksMap.put(200,"B");
		marksMap.put(300,"C");
		marksMap.put(400,"D");
		marksMap.put(500,"E");
		marksMap.put(600,"F");
		marksMap.put(700,"G");
		marksMap.put(800,"H");
		marksMap.put(900,"I");
		marksMap.put(1000,"J");
		List<?> values = new ArrayList(marksMap.values());
		List<?> keys = new ArrayList<>(marksMap.keySet());
		Map<Integer,String> mapSortedMap = new LinkedHashMap<Integer,String>(); 
		for(int i=values.size()-1; i>=0; i--) {
			mapSortedMap.put((Integer)keys.get(i), (String)values.get(i));
		}
		
		Map<Integer,String> solvedMap = new MarksMapSolution().top3MapIterator(mapSortedMap);
		new MarksMapSolution().printMap(solvedMap);
	}

	@Override
	public String toString() {
		return "MarksMapSolution [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	public Map<Integer,String> top3MapIterator(Map<Integer, String> marksMap) {
		int count3 = 0;
		Map<Integer,String> top3Map = new LinkedHashMap<Integer,String>(3);
		for (Entry<?, ?> entry : marksMap.entrySet()) {
			top3Map.put((Integer)entry.getKey(), (String)entry.getValue());
			count3++;
			if(count3 == 3) {
				break;
			}
		}
	 return top3Map;	
	}

	public void printMap(Map<Integer,String> solvedMap) {
		
		for( Entry<Integer,String> entry : solvedMap.entrySet()) {
			System.out.println("Key::"+entry.getKey()+"value::"+entry.getValue());
		}
		
	}
}
