package by.jonline.mod02.part04;

/*Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади,
если угол между сторонами длиной X и Y— прямой.*/
public class Task09 {

	public static void main(String[] args) {
		double x;
		double y;
		double z;
		double t;

		double area;

		x = 3.9;
		y = 4;
		z = 6;
		t = 8.1;

		area = findAreaOfQuadrangle(x, y, z, t);
		
		System.out.println("Площадь четырёхугольника = " + area);

	}

	public static double findLengthOfDiagonal(double x, double y) {

		return Math.sqrt(x * x + y * y);

	}

	public static double findHalfOfPerimeter(double x, double y, double z, double t) {

		double diagonal = findLengthOfDiagonal(x, y);

		double perim = (diagonal + z + t) / 2;

		return perim;
	}

	public static double findAreaOfTriangle(double x, double y, double z, double t) {

		double perim = findHalfOfPerimeter(x, y, z, t);

		double diagonal = findLengthOfDiagonal(x, y);

		double area = Math.sqrt(perim * (perim - diagonal) * (perim - z) * (perim - t));

		return area;

	}

	public static double findAreaOfRightTriangle(double x, double y) {

		return x * y / 2;

	}

	public static double findAreaOfQuadrangle(double x, double y, double z, double t) {

		double s1 = findAreaOfTriangle(x, y, z, t);

		double s2 = findAreaOfRightTriangle(x, y);

		return s1 + s2;

	}

}
