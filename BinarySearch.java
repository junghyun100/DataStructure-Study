import java.util.Arrays;
import java.util.Scanner;


public class BinarySearch{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int []array = {1,4,3,2,5,6};
        Arrays.sort(array);
        int number =scanner.nextInt();
        int result = binarySearch(number,array);
        if(result == -1)
        {
            System.out.println("없어요.");
        }
        else
        {
            System.out.println(result);
        }
    }
    public static int binarySearch(int number, int[] array)
    {
        int first =0;
        int last =array.length-1;
        int mid  = 0;

        while(first <= last)
        {
            mid = (first+last)/2;
            if(number == array[mid]) return array[mid];
            else if(number < array[mid])
            last = mid-1;
            else first = mid+1;
        }
        return -1;
    }
}