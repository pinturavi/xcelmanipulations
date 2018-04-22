package com.pintu.collectionPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.pintu.variableargumens.varargs;

public class CollectionsPractice {

	public static void main(String[] args) {
		Number a = 10;
		varargs varag = new varargs();
		int sum = varag.add();
		System.out.println("Number : "+ a);
		Comparator<String> com = new ComparatorImpl<String>();
		List<String> vegList = new ArrayList<>();
		vegList.add(0, "tomato");
		vegList.add("beans");
		vegList.add(1, "carrot");
		Collections.sort(vegList,com);
		vegList.forEach(veg->System.out.println(veg));
		System.out.println("sum : "+sum);
	}

}
