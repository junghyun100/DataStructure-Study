public class Hanoi {
    public static void main(String[] args) {
        hanoi2(3, 1, 2, 3);
    }
    static void hanoi2(int number, int from, int by, int to) {
        if(number == 1)
        {
            System.out.println("옮겼습니다. "+from+"이쪽으로"+to);
            return;
        }
        hanoi2(number-1, from, to, by);
        System.out.println("옮겼습니다. "+from+"이쪽으로"+to);
        hanoi2(number-1, by, from, to);
    }

}