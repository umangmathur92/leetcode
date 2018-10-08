package Node;

//Definition for singly-linked list.
public class ListNode {

    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
    }

    public ListNode setNext(ListNode next) {
        this.next = next;
        return this;
    }

    @Override
    public String toString() {
        return getNodeStr(this);
    }

    private String getNodeStr(ListNode listNode) {
        StringBuffer stringBuffer = new StringBuffer();
        while (listNode.next != null) {
            stringBuffer.append(listNode.val + " -> ");
            listNode = listNode.next;
        }
        return String.valueOf(stringBuffer.append(listNode.val));
    }

}
