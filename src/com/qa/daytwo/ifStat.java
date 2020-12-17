package com.qa.daytwo;

public class ifStat {

	public static void temp(int temp) {

		if (temp > 24) {
			System.out.println("uncomfy");
			if (temp > 30) {
				System.out.println("turn on AC");
			}
		} else if (temp == 24) {
			System.out.println("perfect");
		} else {
			System.out.println("too cold");
		}
	}

	public static void andOR(int num1, int num2) {
		if (num1 > 50 & num2 > 100) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

	public static void switchcase(int month) {

		switch (month) {
		case 1:
			System.out.println("Jan");
			int a =3;
			a++;
			break;
		case 2:
			System.out.println("Feb");
			break;
		case 3:
			System.out.println("Mar");
			break;
		case 4:
			System.out.println("April");
			break;
		default:
			System.out.println("default");
			break;
		}
	}

}
