package by.jonline.mod02.part04;

/*На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие, между какими
из пар точек самое большое расстояние. Указание. Координаты точек занести в массив.*/
public class Task04 {

	public static void main(String[] args) {

		Point[] mas1 = new Point[] { new Point(2, 4), new Point(4, 9), new Point(-2, 8), null, new Point(-2, 19),
				new Point(9, -4), new Point(3, -8), new Point(-3, -1) };

		Point[] mas2 = new Point[] { new Point(0, 2), new Point(0, 4), null, new Point(4, 4), new Point(4, 2) };

		Point[] mas3 = new Point[] {};

		Point[] mas4 = new Point[] { new Point(0, 2) };

		Point[] mas5 = null;

		Point[] mas6 = new Point[] { null, null, null, new Point(0, 2), null, null };

		findPoints(mas1);
		findPoints(mas2);
		findPoints(mas3);
		findPoints(mas4);
		findPoints(mas5);
		findPoints(mas6);

	}

	public static double findDistance(int x1, int y1, int x2, int y2) {
		return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

	}

	public static double findMaxDistance(Point[] mas) {

		double max = 0;

		for (int i = 0; i < mas.length - 1; i++) {
			if (mas[i] == null) {
				continue;
			}

			for (int j = i + 1; j < mas.length; j++) {
				if (mas[j] == null) {
					continue;
				}

				double temp = findDistance(mas[i].x, mas[i].y, mas[j].x, mas[j].y);

				if (max < temp) {

					max = temp;

				}

			}
		}

		return max;

	}

	public static void findPoints(Point[] mas) {
		if (mas == null) {
			return;
		}

		double max = findMaxDistance(mas);

		if (mas.length < 2) {
			System.out.println("Недостаточено данных");

		} else {
			for (int i = 0; i < mas.length - 1; i++) {
				if (mas[i] == null) {
					continue;
				}

				for (int j = i + 1; j < mas.length; j++) {
					if (mas[j] == null) {
						continue;
					}

					double temp = findDistance(mas[i].x, mas[i].y, mas[j].x, mas[j].y);
					if (temp == max) {
						System.out.println("Максимальное расстояние между точками " + mas[i].x + " " + mas[i].y + " и "
								+ mas[j].x + " " + mas[j].y + " = " + max);
					}

				}

			}
		}
		
		System.out.println();

	}

}

class Point {
	int x;
	int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}