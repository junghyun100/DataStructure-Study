class Tree{
    class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }
        Node root;//트리가 시작하는곳
        public void makeTree(int[]a){
            root = makeTree(a,0,a.length-1);
        }
        public Node makeTree(int[]a,int start, int end){
            if(start > end) return null;
            int mid =(start + end)/2;
            Node node = new Node(a[mid]);
            node.left = makeTree(a,start, mid-1);
            node.right = makeTree(a, mid+1,end);
            return node;
        }
        public void searchBTree(Node n, int find) //이진검색트리
        {
            if(find < n.data)
            {
                System.out.println("data is smaller than "+ n.data);
                searchBTree(n.left, find);
            }
            else if(find > n.data){
                System.out.println("data is bigger than "+ n.data);
                searchBTree(n.right, find);
            }
            else{
                System.out.println("data found");
            }
        }
    }

public class TreeTest {
    public static void main(String[] args) {
        int[] a = {3,8,9,12,5,4,1,7,6,20};
        Tree t= new Tree();
        t.makeTree(a);
        t.searchBTree(t.root,3);
    }
}
