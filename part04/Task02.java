package by.jonline.mod02.part04;

//Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.
public class Task02 {

	public static void main(String[] args) {

		int gcd = findGreatestCommonDivisor(110, 15, 20, 40);
		System.out.println(gcd);

	}

	public static int findGreatestCommonDivisor(int a, int b, int c, int d) {
		int gcd;
		int start;

		gcd = 1;
		start = findMin(a, b, c, d);

		for (int i = start; i > 0; i--) {
			if (a % i == 0 && b % i == 0 && c % i == 0 && d % i == 0) {
				gcd = i;
				break;
			}

		}

		return gcd;
	}

	public static int findMin(int a, int b, int c, int d) {
		
		int min1;
		int min2;

		if (a <= b) {
			min1 = a;
		} else {
			min1 = b;
		}
		
		if (c <= d) {
			min2 = c;
		} else {
			min2 = d;
		}

		if (min1 <= min2) {
			return min1;
		} else {
			return min2;
		}

	}

}
