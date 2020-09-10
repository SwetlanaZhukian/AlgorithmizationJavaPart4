package by.jonline.mod02.part04;

import java.util.Scanner;

/*Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую
последовательность (например, 1234, 5789). Для решения задачи использовать декомпозицию.*/
public class Task15 {

	public static void main(String[] args) {
		int n;

		n = enterFromConsole("Введите количество знаков в числе >> ");

		findDigits(n);

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

		} while (value < 2 || value > 10);

		return value;
	}

	public static void findDigits(int n) {
		int start;
		int end;
		int j;
		int temp;
		boolean b;

		start = (int) Math.pow(10, n - 1);
		end = (int) Math.pow(10, n);

		for (int i = start; i < end; i++) {

			b = false;
			j = i;

			while (j != 0) {

				temp = j % 10;
				j = j / 10;

				if (temp > j % 10) {
					b = true;

				} else {
					b = false;
					break;
				}

			}
			if (b) {
				System.out.print(i + " ");
			}

		}

	}

}
