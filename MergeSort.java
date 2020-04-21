import java.util.Arrays;
 
 
public class MergeSort {
    static int[] sorted = new int[8];
    public static void merge(int a[], int s, int middle, int e) {
        int i = s;             
        int j = middle+1;      
        int k = s;             
        
        while(i<=middle && j<=e) {
            if(a[i]<=a[j]) {
                sorted[k] = a[i];
                i++;
            }else {
                sorted[k] = a[j];
                j++;
            }
            k++;
        }
        if(i>middle) {
            for(int t=j;t<=e;t++,k++) {
                sorted[k] = a[t];
            }
        }else {
            for(int t=i;t<=middle;t++,k++) {
                sorted[k] = a[t];
            }
        }
        
        for(int t=s;t<=e;t++) {
            a[t] = sorted[t];
        }
        System.out.println("병합 정렬 후: "+Arrays.toString(a));
    }
        
    
    public static void mergeSort(int a[], int s, int e) {
        int middle;
        if(s<e) {
            middle = (s+e)/2;
            mergeSort(a, s, middle);    
            mergeSort(a, middle+1, e);    
            merge(a, s, middle, e);
        }
    }
    public static void main(String[] args) {
        int[] list = {58,8,28,3,18,6,33,20};
        int size = list.length;
        System.out.println("정렬 수행 전: "+Arrays.toString(list));
        System.out.println("-----------------병합 정렬 수행 시작------------------");
        mergeSort(list, 0, size-1);
    }
 
}
