package practice.method;

import java.util.Scanner;

public class SumNumber {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("1つ目の整数を入力して下さい : ");
		int firstNum = scanner.nextInt();

		System.out.print("2つ目の整数を入力して下さい : ");
		int secondNum = scanner.nextInt();

		calculateSum(firstNum, secondNum);

		scanner.close();
	}

	public static int calculateSum(int firstNum, int secondNum) {

		int sum = firstNum + secondNum;

		System.out.println("1つ目の引数 :" + firstNum);
		System.out.println("2つ目の引数 :" + secondNum);
		System.out.println("加算結果 :" + sum);

		return sum;

	}

}
