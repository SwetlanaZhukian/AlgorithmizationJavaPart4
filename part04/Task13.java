package by.jonline.mod02.part04;

import java.util.Scanner;

/*Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43).
Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2. Для
решения задачи использовать декомпозицию.
*/
public class Task13 {

	public static void main(String[] args) {
		int n;

		n = enterFromConsole("Введите n >> ");

		findTwins(n);
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

		} while (value <= 2);

		return value;
	}

	public static void findTwins(int n) {

		for (int i = n; i <= n * 2; i++) {

			for (int j = i + 1; j <= n * 2; j++) {

				if (j - i == 2) {

					System.out.print(i + " " + j);
					break;
				}

			}
			System.out.println();

		}

	}

}
