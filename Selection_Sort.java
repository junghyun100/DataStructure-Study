public class Main{
	public static void main(String[] args) {
		int[]array = {10,20,3,15,2,7,6};
		int length = array.length;

		for(int i = 0 ; i < length;i++)
		{
			int min = array[i];
			int index = i;

			for(int j = i+1; j < length; j++)
			{
				if(array[j] < min)
				{
					min = array[j];
					index = j;
				}
			}
			int temp = array[i];
			array[i]= min;
			array[index]= temp;
		}
		for(int i = 0 ; i < length;i++)
		{
			System.out.print(array[i] + " ");
		}
	}
}
