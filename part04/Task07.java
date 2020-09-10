package by.jonline.mod02.part04;

/*Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9*/
public class Task07 {

	public static void main(String[] args) {

		int sum = findSum();
		System.out.println("Сумма факториалов всех нечётных чисел от 1 до 9 = " + sum);
	}

	public static int findFactorial(int number) {

		int result = 1;

		for (int i = 1; i <= number; i++) {
			result = result * i;

		}

		return result;

	}

	public static int findSum() {

		int sum = 0;

		for (int i = 1; i <= 9; i += 2) {
			sum = sum + findFactorial(i);

		}

		return sum;

	}

}
