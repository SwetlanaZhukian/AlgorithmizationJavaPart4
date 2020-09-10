package by.jonline.mod02.part04;

import java.util.Scanner;

/*Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр,
возведенных в степень n, равна самому числу. Найти все числа Армстронга от 1 до k. Для решения задачи
использовать декомпозицию*/
public class Task14 {

	public static void main(String[] args) {
		int k;
		
		k = enterFromConsole("Введите число >>  ");
		
		findNumbers(k);

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

		} while (value <= 1);

		return value;
	}

	public static int countNumberOfDigit(int n) {
		int count = 0;

		do {

			n = n / 10;
			count++;

		} while (n != 0);

		return count;

	}

	public static void findNumbers(int k) {
		int count;
		int sum;
		for (int i = 1; i <= k; i++) {

			count = countNumberOfDigit(i);
			sum = 0;
			int j = i;

			while (j != 0) {

				sum = sum + (int) Math.pow(j % 10, count);
				j = j / 10;
			}

			if (sum == i) {

				System.out.print(i + " ");
			}

		}

	}

}
