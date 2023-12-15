package practice.method;

import java.util.Arrays;
import java.util.Scanner;

//メソッド課題9　拡大解釈バージョン

public class Number {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("半角入力でカンマで区切って数字を入力してください（例: 3,2,5,6）: ");

		String inputNumbers = scanner.nextLine();

		processorNumber prosessorNum = new processorNumber();
		int[] numbers = prosessorNum.inputNumbers(inputNumbers);

		categorizeNumber categorizeNum = new categorizeNumber();
		categorizeNum.categorizeNum(numbers);

		scanner.close();

	}
}

class processorNumber {

	public int[] inputNumbers(String inputNumbers) {

		String[] numberComma = inputNumbers.split(",");

		int[] number = new int[numberComma.length];

		for (int i = 0; i < numberComma.length; i++) {

			number[i] = Integer.parseInt(numberComma[i].trim());

		}

		return number;

	}
}

class categorizeNumber {

	public void categorizeNum(int[] numbers) {

		int evenCount = 0;
		int oddCount = 0;

		for (int number : numbers) {

			if (number % 2 == 0) {
				evenCount++;

			} else {
				oddCount++;

			}
		}

		int[] evenNumbers = new int[evenCount];
		int[] oddNumbers = new int[oddCount];

		int evenIndex = 0;
		int oddIndex = 0;

		for (int number : numbers) {

			if (number % 2 == 0) {
				evenNumbers[evenIndex++] = number;

			} else {
				oddNumbers[oddIndex++] = number;

			}

		}

		System.out.println();
		System.out.println("入力された偶数は" + Arrays.toString(evenNumbers) + "偶数の個数は合計" + evenCount + "個");
		System.out.println();
		System.out.println("入力された奇数は" + Arrays.toString(oddNumbers) + "奇数の個数は合計" + oddCount + "個");
	}
}