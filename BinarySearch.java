import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int []array = { 3, 2, 6, 7, 8, 1, 5 };
        Arrays.sort(array);
        int number = scanner.nextInt();
        int result = binarySearch(number, array);
        if(result ==-1)
        System.out.println("없음");
        else
        System.out.println(array[result]);
        scanner.close();
    }

    public static int binarySearch(int number, int[] array) {
        int first=0;
        int last= array.length-1;
        int mid;
        while(first<=last)
        {
            mid = (first+last)/2;
            if(number ==array[mid])
                return mid;
            else if(number < array[mid])
                last = mid-1;
            else
                first = mid + 1;
        }
        return -1;
    }
}