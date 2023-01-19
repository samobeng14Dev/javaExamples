package javaPractice;

import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		//Method using temporary variable
		
		Scanner scanner=new Scanner(System.in);
		
		int first=0;
		int second=0;
		System.out.println("Enter first number :" +first);
		first =scanner.nextInt();
		
		System.out.println("Enter second number: "+ second);
		 second=scanner.nextInt();
		
		int temp=first;
		
		 first=second;
		 
		 second =temp;
		 
		 System.out.println("first number = " + first);
		 System.out.println("second number= " + second);

	}

}
