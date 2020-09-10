package by.jonline.mod02.part04;

import java.util.Scanner;

/*Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми*/
public class Task06 {

	public static void main(String[] args) {
		int number1;
		int number2;
		int number3;

		boolean result;

		number1 = enterFromConsole("Введите первое число >> ");
		number2 = enterFromConsole("Введите второе число >> ");
		number3 = enterFromConsole("Введите третье число >> ");

		result = determineRelativePrime(number1, number2, number3);

		if (result) {
			System.out.println("Числа " + number1 + " " + number2 + " " + number3 + " взаимно простые");
		} else {
			System.out.println("Числа " + number1 + " " + number2 + " " + number3 + " не взаимно простые");

		}

	}

	public static int enterFromConsole(String str) {

		int value;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		do {
			System.out.print(str);

			while (!sc.hasNextInt()) {

				sc.next();
				System.out.print(str);

			}

			value = sc.nextInt();

		} while (value <= 0);

		return value;

	}

	public static int findGreatestCommonDivisor(int a, int b) {

		int gcd = 0;

		if (a == b) {
			return a;
		}

		while (a != 0 && b != 0) {

			if (a > b) {

				a = a % b;

			} else {

				b = b % a;
			}
		}

		if (a == 0) {
			gcd = b;
		}
		if (b == 0) {
			gcd = a;
		}

		return gcd;
	}

	public static boolean determineRelativePrime(int a, int b, int c) {

		int gcd;
		int temp;

		boolean result = false;

		temp = findGreatestCommonDivisor(a, b);
		gcd = findGreatestCommonDivisor(temp, c);

		if (gcd == 1) {
			result = true;
		} else {
			result = false;
		}

		return result;

	}

}
