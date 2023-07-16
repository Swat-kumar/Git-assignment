package com.calculator;

public class CalculatorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculatorApp cal = new CalculatorApp();
		System.out.println("End results are");
		System.out.println(cal.sum(31, 8));
		System.out.println(cal.substraction(15, 1));
		System.out.println(cal.multiplication(23, 81));
		System.out.println(cal.division(1200, 40));
	}
    public int sum(int a, int b) {
     int result;
    result=a+b;
    return result;
	}
    public int substraction(int a, int b) {
    	int result; 
    	result= a-b;
    	return result;
    }
    public int multiplication(int a, int b) {
    int result;
    result=a*b;
    return result;
    }
    public int division(int a, int b) {
    	int result;
    	result=a/b;
    	return result;
    	
    	
    }
    
}
