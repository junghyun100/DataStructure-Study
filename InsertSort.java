public class InsertSort{
	public static void main(String[] args) {
		int[]array = {10,20,3,15,2,7,6};
		int length = array.length;
		insertion_Sort(array);
		for(int i = 0; i < length; i++){
            System.out.print(array[i] + " ");
        }
	}

	public static void insertion_Sort(int[] array) {
		int length = array.length;
		int temp = 0;
		int j=0;
		for(int i =1 ; i< length; i++)
		{
			temp=array[i];
			for(j=i-1; j>=0 && temp< array[j];j--)
			{
				array[j+1] =array[j];
			}
			array[j+1]= temp;
		}
	}
}