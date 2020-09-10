package by.jonline.mod02.part04;

import java.util.Scanner;

/*Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. Сколько таких
действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.*/
public class Task17 {

	public static void main(String[] args) {
		int n;
		int count;

		n = enterFromConsole("Введите число >> ");

		count = countActions(n);
		System.out.println("Количество вычитаний = " + count);

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

		} while (value < 1);

		return value;
	}

	public static int findSumOfNumbers(int n) {
		int sum = 0;

		while (n != 0) {

			sum = sum + n % 10;
			n = n / 10;
		}

		return sum;
	}

	public static int countActions(int n) {
		
		int count = 0;
		
		while (n != 0) {

			n = n - findSumOfNumbers(n);

			count++;
		}
		return count;

	}

}
