package Node;

//Definition for singly-linked list.
public class Node {

    public int val;
    public Node next;

    public Node(int x) {
        val = x;
    }

    public Node setNext(Node next) {
        this.next = next;
        return this;
    }

    @Override
    public String toString() {
        return getNodeStr(this);
    }

    private String getNodeStr(Node node) {
        StringBuffer stringBuffer = new StringBuffer();
        while (node.next != null) {
            stringBuffer.append(node.val + " -> ");
            node = node.next;
        }
        return String.valueOf(stringBuffer.append(node.val));
    }

}
