package com.pintu.MapPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapPractice {

	public static void main(String[] args) {
		Map<String, String> phonebook = new HashMap<>();
		phonebook.putIfAbsent("pintu", "8608207868");
		phonebook.put("ravi", "6785676767");
		phonebook.put("mental", "5677897890");
		phonebook.putIfAbsent("speed", "2342342342");
		Set<String> nameList = new HashSet<>();
		nameList =  phonebook.keySet();
		nameList.forEach(name->System.out.println(name + " " + phonebook.get(name)));
		Set<Map.Entry<String, String>> e = phonebook.entrySet();
		for (Map.Entry<String, String> e1 : e ) {
			System.out.println(e1.getKey() + " " + e1.getValue());
		}
		phonebook.forEach((k,v)->System.out.println(k + " " +v));
	}

}
