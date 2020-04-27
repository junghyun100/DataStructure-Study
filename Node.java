public class Node {
    private Object data;
    private Node nextNode;
    public Node(Object data) {
        this.data = data;
        this.nextNode = null;
    }
    public void linkNode(Node top) {
        this.nextNode = top;
    }
    public Object getData() {
        return this.data;
    }
    public Node getNextNode() {
        return this.nextNode;
    }
}