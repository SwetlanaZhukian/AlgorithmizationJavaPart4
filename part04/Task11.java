package by.jonline.mod02.part04;

import java.util.Scanner;

//Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.
public class Task11 {

	public static void main(String[] args) {
		int n;
		int m;

		n = enterFromConsole("Введите первое число >> ");
		m = enterFromConsole("Введите второе число >> ");
		
		compareNumberOfDigits(n, m);

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

	public static void compareNumberOfDigits(int a, int b) {

		int count1 = countNumberOfDigits(a);
		int count2 = countNumberOfDigits(b);

		if (count1 < count2) {
			System.out.println("В числе " + b + " больше цифр, чем в числе " + a);
		} else if (count1 > count2) {
			System.out.println("В числе " + a + " больше цифр, чем в числе " + b);
		} else {
			System.out.println("В числax " + a + " и " + b + " одинаковое количество цифр ");
		}

	}

}
