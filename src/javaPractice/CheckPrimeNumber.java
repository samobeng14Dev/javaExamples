package javaPractice;

import java.util.Scanner;

public class CheckPrimeNumber {

	public static void main(String[] args) {
		
Scanner scanner = new Scanner(System.in);
System.out.println("Enter a value: ");
int value =scanner.nextInt();

boolean isPrime=true;

//since one and negative values are not prime numbers
if(value < 2) {
	isPrime=false;
} else {
	//check if value is divisible any number from 2 to value/2
	for(int i=2; i<=value/2; ++i) {
		if(value % i==0) {
			isPrime=false;
			
			break;
		}
		
	}
}
if(isPrime) {
	System.out.println(value+ " is a prime number");
}else {
	System.out.println("the number "+ value + " is not a prime number" );
}

	}

}
