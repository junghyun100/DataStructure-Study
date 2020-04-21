import java.util.Arrays;
 
public class ShellSort {
    public static void intervalSort(int a[], int s, int e, int inter) {
        int j;
        for(int i=s+inter;i<=e;i=i+inter) {
            int item = a[i];
            for(j = i-inter;j>=s && item<a[j]; j=j-inter) {
                a[j+inter] = a[j];
            }
            a[j+inter] = item;
        }
    }
    public static void shellSort(int[] a, int size) {
        System.out.println("정렬할 원소:"+Arrays.toString(a));
        System.out.println("-----------------셸 정렬 수행------------------");
        int inter = size/2;
        while (inter >=1){
            for(int i=0;i<inter;i++) {
                intervalSort(a, i, size-1, inter);
            }
            System.out.println("interval = "+inter);
            for(int t=0;t<size;t++) {
                System.out.print(a[t]+" ");
            }
            System.out.println();
            inter = inter/2;
        }
    }
    
    public static void main(String[] args) {
        int[] list = {16, 7, 30, 3, 69, 9, 31, 23};
        int size = list.length;
        shellSort(list, size);
 
    }
 
}