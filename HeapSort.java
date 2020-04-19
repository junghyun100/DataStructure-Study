public class HeapSort {
	private static void heapSort(int[] arr)// 기능1
	{
		int n = arr.length;

		for (int i = n / 2 - 1; i >= 0; i--) {
			heapify(arr, n, i);
		}

		for (int i = n - 1; i > 0; i--) {
			swap(arr, 0, i);
			heapify(arr, i, 0);
		}
	}

	private static void heapify(int[] arr, int n, int i)// 기능2
	{
		int p = i;
		int l = i * 2 + 1;
		int r = i * 2 + 2;

		if (l < n && arr[p] < arr[l]) {
			p = l;
		}

		if (r < n && arr[p] < arr[r]) {
			p = r;
		}
		/* 최대
		if (l < n && arr[p] > arr[l]) {
			p = l;
		}

		if (r < n && arr[p] > arr[r]) {
			p = r;
		}*/

		if (i != p) {
			swap(arr, p, i);
			heapify(arr, n, p);
		}
	}

	private static void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}

	private static void printArray(int[] arr) {
		for (int data : arr) {
			System.out.print(data + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] arr = { 3, 9, 4, 7, 5, 0, 1 };
		printArray(arr);
		heapSort(arr);
		printArray(arr);
	}
}
