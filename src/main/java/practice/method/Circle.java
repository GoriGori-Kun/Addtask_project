package practice.method;

public class Circle {

	public static void main(String[] args) {

		double radius = 5.0;

		getCircleArea(radius);

	}

	public static double getCircleArea(double radius) {

		double pi = 3.14;

		double area = radius * radius * pi;

		System.out.println("半径 : " + radius + "cm");
		System.out.println("円の面積 : " + area + "cm²");

		return area;

	}
}

//数学ライブラリのMath.PIは円周率求められる
//double pi = Math.PI;
