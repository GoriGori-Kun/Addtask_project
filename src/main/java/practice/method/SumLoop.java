package practice.method;

public class SumLoop {

	public static void main(String[] args) {

		int min = 1;
		System.out.println("最小値 : " + min);

		int max = 100;
		System.out.println("最大値 : " + max);

		sumLoop(min, max);

		yesMath(min, max);

	}

	public static int sumLoop(int min, int max) {

		int sum = 0;

		for (int i = min; i <= max; i++) {
			sum += i;
		}
		System.out.println("加算結果 : " + sum);
		return sum;
	}

	public static int yesMath(int min, int max) {

		int ans = (max * (max + 1)) / 2 - (min * (min - 1)) / 2;

		System.out.println("tryの答え : " + ans);

		return ans;
	}

}
