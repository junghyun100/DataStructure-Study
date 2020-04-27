public class StackL {
    public static void main(String[] args) {

        // array를 사용한 스택과 사용방법이 같다.

        ListStack stackL = new ListStack();

        stackL.push(5);

        stackL.push("Hi");

        stackL.push("again");

        stackL.push("Monsieur Songsong");

        while (!stackL.isEmpty()) {

            System.out.println(stackL.pop());

        }

    }
}
