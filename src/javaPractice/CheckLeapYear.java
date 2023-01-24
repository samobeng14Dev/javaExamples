package javaPractice;

import java.util.Scanner;
import java.time.Year;
import java.util.function.Predicate;

public class CheckLeapYear {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.print("Enter the year: ");
		int year =scanner.nextInt();
		Predicate<Integer>isLeapYear=y->Year.isLeap(y);
		if(isLeapYear.test(year)) {
			System.out.println(year + " is a leap year");
		}else {
			System.out.println(year + "is not a leap year");
		}
		}
	

}
