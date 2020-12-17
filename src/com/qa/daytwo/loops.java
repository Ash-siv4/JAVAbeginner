package com.qa.daytwo;

public class loops {
	
	public static void forLoop() {
		for(int i = 0; i < 10; i++) {
            System.out.println(i);
        }
	}
	
	public static void whileLoop() {
		int count = 2;
		System.out.println("while loop");
		System.out.println("===============");
		while(count<2) {
			count++;
			System.out.println("hello"+count);
			}
		}
	
	
	public static void doWWhileLoop() {
		int count = 2;	    
		System.out.println();
		System.out.println("do-while loop");
		System.out.println("===============");
	    do {
	    	count++;
	    	System.out.println("hello" + count);
	    	} while(count<2);
	}
	
}
