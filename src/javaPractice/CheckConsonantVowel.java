package javaPractice;

import java.util.Scanner;

public class CheckConsonantVowel {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter an alphabet: ");
		
		char checkVowel=scanner.next().charAt(0);
		
		switch(checkVowel) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		
			System.out.println(checkVowel + " is a vowel");
			break;
			
			default: System.out.println(checkVowel + " is a consonant");
		}
		}
		

	}


