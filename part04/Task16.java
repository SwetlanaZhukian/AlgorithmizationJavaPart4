package by.jonline.mod02.part04;

import java.util.Scanner;

/*Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.*/
public class Task16 {

	public static void main(String[] args) {
		int n;
		int sum;
		int count;

		n = enterFromConsole("Введите количество знаков в числе >> ");

		sum = findSum(n);
		System.out.println("Сумма = " + sum);
		
		count = countEvenNumbers(sum);
		System.out.println("В числе "+ sum + " количество чётных цифр = " + count );

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

		} while (value < 1 || value > 10);

		return value;
	}

	public static int findSum(int n) {
		int start;
		int end;
		int j;
		int sum;
		boolean b;

		start = (int) Math.pow(10, n - 1);
		end = (int) Math.pow(10, n);
		sum = 0;

		for (int i = start; i < end; i++) {

			j = i;

			b = false;

			while (j != 0) {

				if (j % 2 != 0) {

					b = true;

				} else {

					b = false;
					break;
				}

				j = j / 10;
			}

			if (b) {

				System.out.print(i + " ");
				sum = sum + i;
			}

		}

		System.out.println();

		return sum;

	}

	public static int countEvenNumbers(int a) {
		
		int count = 0;
		int temp;

		while (a != 0) {

			temp = a % 10;

			if (temp % 2 == 0) {
				count++;
			}

			a = a / 10;
		}
		return count;

	}

}
