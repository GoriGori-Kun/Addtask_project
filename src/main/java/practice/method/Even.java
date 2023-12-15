package practice.method;

import java.util.Scanner;

public class Even {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("好きな数字を入力すると判定します : ");

		int keynum = scanner.nextInt();

		checkEven(keynum);

		scanner.close();

	}

	public static boolean checkEven(int keynum) {

		boolean even = (keynum % 2 == 0);

		if (even) {

			System.out.println(keynum + "は偶数です。");

		} else {

			System.out.println(keynum + "は奇数です。");

		}

		return even;
	}

}
