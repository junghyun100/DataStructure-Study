import java.util.Scanner;

public class Bubble_Sort {
	public static void main(String[] args) {
		int[] array = { 3, 2, 6, 7, 8, 1, 5 };
		bubble_Sort(array);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

	public static void bubble_Sort(int[] array) {
		int i, j, temp;
		for (i = array.length - 1; i > 0; i--) {
			for (j = 0; j < i; j++) {
				if (array[j] > array[j + 1]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
	}
}
