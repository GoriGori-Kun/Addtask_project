package practice.basictask;

public class MultiplicationTable {

	public static void main(String[] args) {

		System.out.println(" for文九九");

		for (int a = 1; a <= 9; a++) { // 縦列

			for (int b = 1; b <= 9; b++) { // 横列

				int c = a * b;

				System.out.printf("%3d", c);

			}

			System.out.println();
		}

		System.out.println();

		System.out.println(" while文九九");

		int x = 1;

		while (x < 10) {

			int y = 1;
			System.out.print(" ");

			while (y < 10) {

				int z = x * y;

				y++;

				System.out.printf("%3d", z);

			}

			x++;

			System.out.println();

		}

	}
}
