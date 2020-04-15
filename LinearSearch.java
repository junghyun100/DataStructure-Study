import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = { 3, 2, 6, 7, 8, 1, 5 };
        int number = scanner.nextInt();
        int result = linearSearch(number, array);
        if(result == -1 )
            System.out.println("없음");
        else 
            System.out.println(array[result]);
    }

    public static int linearSearch(int N, int[] array) {
        for (int i = 0; i < array.length ; i++) {
            if (N == array[i])
                return i;
        }
        return -1;
    }
}