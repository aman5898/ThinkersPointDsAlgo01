package dsAlgo01;
import java.util.*;
public class HelloWorld {
	public static void main(String[] args) {
//		System.out.println("*");
//		System.out.println("*");
//		System.out.println("***");
//		System.out.println("****");

//		to take Input
		Scanner scn = new Scanner(System.in);
//		int t = scn.nextInt();

//		int xy = 20;
//		System.out.println(xy);
//		
//		int aish = scn.nextInt();
//		System.out.println(aish);

//		Add two numbers
//		int num1=0;
//		int num2=0;
//		num1 = scn.nextInt();
//		num2= scn.nextInt();
//		System.out.println(num1+num2);
//		double temp = 22.2;
//		int temp2 = (int)22.2;
////		System.out.println(temp2);
//
////		int c = scn.nextInt();
////		double f = (9.0 / 5) * c + 32;
////		System.out.println(f);
//		System.out.println((9*(1.0))/5);

//		conditional statements
//		if else
//		if(some condition) {
//			
//		}else if(some condition) {
//			
//		}else {
//			
//		}

//		int num = 28;
//		if (num > 25) {
//			if (num > 35) {
//				System.out.println("Thinkerspoint rocks");
//			}
//		} else if (num > 10) {
//			System.out.println("Thinkers point is best again");
//		} else if (num > 0) {
//			System.out.println("Thinkers point is superb");
//		}

//		int x = scn.nextInt();
//		int y = scn.nextInt();
//		
//		if(x>y) {
//			System.out.println(x);
//		}else {
//			System.out.println(y);
//		}

//		scopes - > the area in which a variable lives
//		The scope is the curly braces in which it is declared
//		int x = 5;
//		int y = 10;
//		int z = 100;
//		if (y > 5) {
//			System.out.println(x);
//		} else {
//			System.out.println(z);
//		}

//		int x = scn.nextInt();
//		int y = scn.nextInt();
//		int z = scn.nextInt();
//
//		if (x > y) {
//			if (x > z) {
//				System.out.println(x);
//			} else {
//				System.out.println(z);
//			}
//		} else {
//			if (y > z) {
//				System.out.println(y);
//			} else {
//				System.out.println(z);
//			}
//		}

//		loops
//		iterating statements
//		for loop while loop do while loop
//		while loop
//		while(condition) {
//			
//		}

//		you should give a terminating condition
//		you should write something that takes the loop to termination
//		int num = 1;
//		while(num<=10) {			
//			System.out.println(num);
//			num++;
//		}
//		
//		int num = 1;
//		while (num <= 10) {
//			if (num % 2 == 0) {
//				System.out.println(num + " -> even");
//			} else {
//				System.out.println(num + " ->Odd");
//			}
//			num++;
//		}

		int num = 120;
		int rev = 0;
		while (num > 0) {
			int rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}

		System.out.println(rev);

	}
}