package by.jonline.mod02.part04;

import java.util.Scanner;

/*Даны натуральные числа К и N. Написать метод(методы) формирования массива А, элементами которого
являются числа, сумма цифр которых равна К и которые не больше N.*/

public class Task12 {

	public static void main(String[] args) {
		int k;
		int n;

		k = enterFromConsole("Введите K >> ");
		n = enterFromConsole("Введите N >> ");
		int j = determineNumbersOfElements(k, n);
		System.out.println(j);
		int[] mas = createArray(k, n);
		if (mas.length == 0) {
			System.out.println("Таких чисел нет");
		} else {
			printArray(mas);
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

	public static int determineNumbersOfElements(int k, int n) {
		int count = 0;
		int sum = 0;
		for (int i = k; i <= n; i++) {
			sum = 0;
			int j = i;
			while (j != 0) {
				sum = sum + j % 10;
				j = j / 10;
			}
			if (sum == k) {
				count++;
			}

		}
		return count;

	}

	public static int[] createArray(int k, int n) {

		int count = determineNumbersOfElements(k, n);
		
		int[] mas = new int[count];
		
		int sum = 0;
		int l = 0;
		
		for (int i = k; i <= n; i++) {
			sum = 0;
			int j = i;
			
			while (j != 0) {
				
				sum = sum + j % 10;
				j = j / 10;
			}
			
			if (sum == k) {
				
				mas[l] = i;
				l++;

			}

		}
		return mas;

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

}
