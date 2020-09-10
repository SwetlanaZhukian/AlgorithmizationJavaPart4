package by.jonline.mod02.part04;

import java.util.Scanner;

/*Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов
массива с номерами от k до m.*/
public class Task08 {

	public static void main(String[] args) {

		int k;
		int m;

		int[] mas = new int[] { -8, 0, 9, 6, 3, 1, 3, 4, 5, 1, 2, 3, 9, 0, 7, 4 };

		k = enterFromConsole("Введите k >> ");
		while (k >= mas.length) {
			k = enterFromConsole("Введите k >> ");
		}

		m = enterFromConsole("Введите m >> ");
		while (m <= k || m > mas.length) {
			m = enterFromConsole("Введите m >> ");
		}

		printArray(mas);

		if (m - k >= 3) {
			findSum(mas, k, m);
		} else {
			System.out.println("Указанный промежуток содержит менее 3-х элементов");
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

		} while (value < 0);

		return value;
	}

	public static void printArray(int[] mas) {
		if (mas == null) {
			return;
		}

		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + " ");

		}

		System.out.println();

	}

	public static void findSum(int[] mas, int k, int m) {
		if (mas == null) {
			return;
		}
		int sum = 0;
		int count = 0;
		int i = k;

		while (i < m) {
			sum = sum + mas[i];
			count++;
			System.out.print(mas[i] + " ");
			if (count == 3) {
				System.out.println("cумма элементов = " + sum);
				count = 0;
				sum = 0;

			}
			i++;

		}

	}

}
