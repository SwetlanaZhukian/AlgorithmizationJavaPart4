package by.jonline.mod02.part04;

import java.util.Random;
import java.util.Scanner;

/*Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число,
которое меньше максимального элемента массива, но больше всех других элементов).*/
public class Task05 {

	public static void main(String[] args) {
		int n;
		int[] mas;
		int result;

		n = enterFromConsole("Введите размерность массива >> ");

		mas = new int[n];

		initArray(mas);
		printArray(mas);

		if (mas.length >= 2) {
			result = findElementBeforeMax(mas);
			System.out.println("Второе по величине число = " + result);
		} else {
			System.out.println("Недостаточно данных");
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

		} while (value < 0 || value > 20);

		return value;

	}

	public static void initArray(int[] mas) {
		if (mas == null) {
			return;
		}

		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(30);

		}

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

	public static int findMaxElement(int[] mas) {
		if (mas == null) {
			return 0;
		}

		int max = 0;

		for (int i = 0; i < mas.length; i++) {
			if (max < mas[i]) {
				max = mas[i];
			}

		}

		return max;
	}

	public static int findElementBeforeMax(int[] mas) {
		if (mas == null) {
			return 0;
		}

		int max = findMaxElement(mas);

		int result = 0;

		for (int i = 0; i < mas.length; i++) {
			if (mas[i] == max) {
				continue;
			}

			if (result < mas[i]) {
				result = mas[i];
			}

		}

		return result;
	}

}
