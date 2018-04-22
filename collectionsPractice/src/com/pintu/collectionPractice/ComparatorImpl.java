package com.pintu.collectionPractice;

import java.util.Comparator;

public class ComparatorImpl<T> implements Comparator<String> {

	@Override
	public int compare(String arg0, String arg1) {
		if (arg0.charAt(0) < arg1.charAt(0)) 
			return 1;
		return 0;
	}

}
