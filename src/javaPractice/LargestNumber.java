package javaPractice;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter first number: ");
		int num1=scanner.nextInt();
		
		System.out.println("Enter second number: ");
		int num2=scanner.nextInt();
		
		System.out.println("Enter third  number: ");
		int num3=scanner.nextInt();
		
		System.out.print("Numbers Entered are: " + num1+ " ,"+num2 + " ,"+num3);
		
		System.out.println("");
		
		if(num1 > num2 && num1 >num3 ) {
			System.out.println(num1+ " is the largest number");
		}else if(num2 > num1 && num2 > num3){
			System.out.println(num1+ " is the largest number");
			
			
		}else {
			System.out.println(num3+ " is the largest number");
		}
		
		
		

	}

}
