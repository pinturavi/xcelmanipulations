package com.pintu.variableargumens;

class Calculator {
public	int add(int ... n) {
	int sum = 0;
	for (int i : n) {
		sum += i;
	}
	return sum;
	}
}

public class varargs {

	public  int add () {
		Calculator cal = new Calculator();
		return cal.add(1,2,3,4,5);
	}
}
