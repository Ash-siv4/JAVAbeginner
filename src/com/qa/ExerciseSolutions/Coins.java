package com.qa.ExerciseSolutions;

public class Coins {
	
	public void change(double cost,double amount) {

		int n10 = 0;
		int n5 = 0;
		int c20 = 0;
		int c2 = 0;
		
		double payback = amount - cost;
		System.out.println("Change expected: £" + payback);
		
		while(payback>=10) {
			payback -= 10; // payback = payback - 10;
			n10++;
		}
		System.out.println(n10 + ": £10 note");
		
		while(payback>=5) {
			payback -= 5; 
			n5++;
		}
		System.out.println(n5 + ": £5 note");
		
		while(payback>=0.2) {
			payback -= 0.2; 
			c20++;
		}
		System.out.println(c20 + ": 20p's");
		
		//Rounding errors because JAVA rounds down
		while(payback>=0.019) {
			payback -= 0.019; //use 0.019 instead of 0.02 to overcome
			c2++;
		}
		System.out.println(c2 + ": 2p's");
	}	
	
}




















//int n50 = 0;
//int n20 = 0;
//int p2 = 0;
//int p1 = 0;
//int c50 = 0;

//int c10 = 0;
//int c5 = 0;
//int c1 = 0;



//while(payback>=50) {
//payback = payback - 50;
//n10++;
//}
//System.out.println(n50 + ": £50 note");
//
//while(payback>=20) {
//payback -= 20; 
//n20++;
//}
//System.out.println(n20 + ": £20 note");
