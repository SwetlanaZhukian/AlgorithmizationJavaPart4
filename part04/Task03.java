package by.jonline.mod02.part04;

/*Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади
треугольника*/
public class Task03 {

	public static void main(String[] args) {
		
		int a = 10;
		double area = calculateArea(a);
		
		System.out.print("Площадь шестиугольника = " + area);
	}

	public static double calculateArea(int a) {
		double area;
		
		area = (3.0 * Math.sqrt(3.0)) / 2 * a * a;
		
		return area;
		

	}

}
