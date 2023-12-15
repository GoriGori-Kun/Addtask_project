package practice.method;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("底辺は？: ");
		int bottom = scanner.nextInt();

		System.out.print("高さは？");
		int high = scanner.nextInt();

		getTriangleArea(bottom, high);

		scanner.close();

		tryHeron();
	}

	public static int getTriangleArea(int bottom, int high) {

		int sum = (bottom * high) / 2;

		System.out.println("底辺 :" + bottom);
		System.out.println("高さ :" + high);
		System.out.println("三角形の面積は" + sum + "cm²");

		return sum;

	}

	public static double tryHeron() {

		int a = 4;
		int b = 10;
		int c = 8;

		double x = (a + b + c) / 2.0;

		double area = Math.sqrt(x * (x - a) * (x - b) * (x - c));

		System.out.println("気にしないでヘロン公式 :" + area + "cm²");

		return area;

	}
}
