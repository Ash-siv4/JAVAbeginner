package com.qa.daythree;

import java.util.ArrayList;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String str = "hElloO";//012345

//		System.out.println(str.length());//6
//		System.out.println(str.toLowerCase());//helloo
//		System.out.println(str.toUpperCase());//HELLO
//		System.out.println(str.indexOf("l"));//2
//		System.out.println(str.contains("ll"));//true
//		System.out.println(str.charAt(3));//l
//		System.out.println(str.endsWith("t"));//
//		System.out.println(str.substring(1,3));

		System.out.println("----------- Array --------------");

		int[] age = { 2, 3, 4 };
		System.out.println(age[1]);

		int[][] ageArray = { { 25, 30, 21 }, { 56, 67, 39 }, { 8 } };
		System.out.println(ageArray[0][1]);
		System.out.println();
		// [row] [col]
		// 0 1 2
		// 0 - 25 30 21
		// 1 - 56 67 39
		// 2 - 8
		int[] a = new int[5];// { , , , , }
		a[0] = 3;

		int[] testArray = new int[10];

		for (int i = 0; i < testArray.length; i++) {
			int n = i * 10;
			testArray[i] = n;
			System.out.println(n);
		}


		System.out.println("----------- Array List --------------");

		ArrayList<Integer> arrL = new ArrayList<>();
		arrL.add(3);
		arrL.add(3);
		arrL.add(3);
		arrL.add(3);
		arrL.add(3);

		System.out.println(arrL.get(0));
		System.out.println(arrL.size());
		Object copy = arrL.clone();
		System.out.println(copy);
		
		System.out.println("----------- Array List --------------");

//		String[] stringArray = {"a","b","c","d","e"};
//		
//		for(String str:stringArray) {
//			
//			System.out.println(str);
//		}

		array x = new array();
		x.arr();
		
		ForLoopEX.intLoop2();
	}

}
