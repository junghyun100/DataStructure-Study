public class QuickSort{
	private static void quickSort(int[] arr)//재귀
	{
		quickSort(arr,0,arr.length-1);
	}
	private static void quickSort(int[]arr, int s, int e)//기능
	{
		int part2 = partition(arr,s,e);
		if(s < part2 -1){
			quickSort(arr,s,part2 -1);
		}
		if(part2 < e){
			quickSort(arr,part2,e);
		}
	}
	private static int partition(int[]arr,int s, int e)//기능2
	{
		int pivot = arr[(s+e)/2];
		while(s <=e){
			while(arr[s]<pivot) s ++;
			while(arr[e]>pivot) e --;
			if(s <= e){
				swap(arr,s, e);
				s++;
				e--;
			}
		}
		return s;
	}
	private static void swap(int[]arr, int s,int e)
	{
		int temp = arr[s];
		arr[s] = arr[e];
		arr[e]= temp;
	}
	private static void printArray(int[]arr){
		for(int data : arr)
		{
			System.out.print(data+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int[] arr = {3,9,4,7,5,0,1};
		printArray(arr);
		quickSort(arr);
		printArray(arr);
	}
}
