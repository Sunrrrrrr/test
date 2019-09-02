package paixu;

import java.util.Arrays;

public class Bubble {

	public static void main(String[] args) {
		int[] arr = { 22, 44, 11, 66, 77, 33, 1, 99, 88 };

		int len = arr.length;

		for (int i = 0; i < len - 1; i++) {

			boolean flag = true;
			for (int j = 0; j < len - 1 - i; j++) {

				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					flag = false;
				}
			}
			if (flag) {
				break;
			}
		}
		System.out.println(Arrays.toString(arr));

	}

}
