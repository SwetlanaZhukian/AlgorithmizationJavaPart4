package by.jonline.mod02.part04;

import java.util.Scanner;

/*Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух
натуральных чисел*/
public class Task01 {

	public static void main(String[] args) {
		int a;
		int b;
		int gcd;
		int lcm;

		a = enterFromConsole("Введите первое число >> ");
		b = enterFromConsole("Введите второе число >> ");

		gcd = findGreatestCommonDivisor(a, b);
		lcm = findLeastCommonMultiple(a, b);
		
		System.out.println("Наибольший общий делитель = " + gcd);
		System.out.println("Наименьшее общее кратное = " + lcm);

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

	public static int findLeastCommonMultiple(int a, int b) {
		int lcm;

		lcm = a / findGreatestCommonDivisor(a, b) * b;

		return lcm;

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

		} while (value < 0);

		return value;

	}

}
