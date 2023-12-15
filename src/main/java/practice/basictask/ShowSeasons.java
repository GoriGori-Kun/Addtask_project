package practice.basictask;

import java.util.Scanner;

public class ShowSeasons {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("↓好きな月を入力すると四季を判定します↓");

		int month = scanner.nextInt();

		String season = "";

		switch (month) {

		case 3, 4, 5:

			season = "春";
			break;

		case 6, 7, 8:

			season = "夏";
			break;

		case 9, 10, 11:

			season = "秋";
			break;

		case 12, 1, 2:

			season = "冬";
			break;

		default:

			season = "存在しない";
			break;

		}

		System.out.println(month + "月は" + season + "です。");

		scanner.close();
	}
}
