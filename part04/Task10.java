package by.jonline.mod02.part04;

import java.util.Scanner;

/*Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого
являются цифры числа N.*/
public class Task10 {

	public static void main(String[] args) {
		int n;
		n = enterFromConsole("Введите число >> ");

		int[] mas = createArray(n);
		System.out.println("Массив из цифр числа " + n);
		printArray(mas);

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

	public static int countNumberOfDigits(int n) {
		int count = 0;

		do {

			n = n / 10;
			count++;

		} while (n != 0);

		return count;

	}

	public static int[] createArray(int n) {

		int count = countNumberOfDigits(n);

		int[] mas = new int[count];

		for (int i = mas.length - 1; i >= 0; i--) {
			mas[i] = n % 10;
			n = n / 10;

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
