package main;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.SortedMap;
import java.util.TreeMap;

public class Roman {
	
	public Roman() {
		
	}
	
	/**
	 * Converts an Arabic number into a Roman number.
	 * 
	 * @param arabicNumber The Arabic number to convert.
	 * @return The corresponding Roman number as String.
	 */
	public String toRoman(int arabicNumber) {
		// TODO implement this method incrementally using TDD

		SortedMap<Integer, String> dictionary = new TreeMap<Integer, String>();
		dictionary.put(1,"I");
		dictionary.put(2,"II");
		dictionary.put(3,"III");
		dictionary.put(4,"IV");
		dictionary.put(5,"V");
		dictionary.put(6,"VI");
		dictionary.put(7,"VII");
		dictionary.put(8,"VIII");
		dictionary.put(9,"IX");
		
		dictionary.put(10,"X");
		dictionary.put(20,"XX");
		dictionary.put(30,"XXX");
		dictionary.put(40,"XL");
		dictionary.put(50,"LV");
		
		dictionary.put(60,"LX");
		dictionary.put(70,"LXX");
		dictionary.put(80,"LXXX");
		dictionary.put(90,"XC");
		
		dictionary.put(100,"C");
		dictionary.put(500,"D");
		dictionary.put(1000,"M");
	
	
		
		   for (SortedMap.Entry<Integer, String> entry : dictionary.entrySet()) {
	            
	           System.out.println(entry.getKey()+ " test "+ entry.getValue()+"\n");
	        }
	
		return dictionary.get(arabicNumber);
	}

}
