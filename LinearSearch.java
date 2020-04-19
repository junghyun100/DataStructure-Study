import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int[] array = {3,2,6,4,9,7};
        int result = linearSearch(number, array);
        if(result == -1)
        {
            System.out.println("없어요.");
        }
        else
        {
            System.out.println(result);
        }
    }
    public static int linearSearch(int number, int[]array){
        for(int i =0 ; i <array.length;i++)
        {
            if(number ==array[i]) return array[i];
        }
        return -1;
    }
}