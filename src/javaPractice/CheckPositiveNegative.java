package javaPractice;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class CheckPositiveNegative {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a value: ");
		int input = scanner.nextInt();

		List<Integer> numbers = List.of(input);
		numbers.stream().filter(t -> t > 0).findAny().ifPresentOrElse(t -> System.out.println(t + " is positive "),

				() -> {
					numbers.stream().filter(t -> t < 0).findAny().ifPresentOrElse(
							t -> System.out.println(t + " is negative"),

							() -> System.out.println(input + " is Zero"));
				});

	}
}
