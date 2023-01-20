package javaPractice;

import java.util.Scanner;

public class CheckEvenOdd {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a value: ");
		int value =scanner.nextInt();
		if(value % 2==0) {
			System.out.println(value + " is an even number");
		}else {
			System.out.println(value + " is an odd number" );
		}
		
		

	}

}
