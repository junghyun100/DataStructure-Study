import java.util.Scanner;
public class GCD{
    public static int gcd(int num1, int num2){
        if(num2 == 0) return num1;
        else return gcd(num2, num1 % num2);
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt(), num2 = sc.nextInt();
        int gcd = gcd(num1, num2);
        System.out.println(gcd);//최대공약수
        System.out.println(num1 * num2 / gcd);//최소공배수
    }
}