package lc83_RemoveDuplicatesFromSortedList;

import Node.Node;
import Utils.Util;

public class RemoveDuplicatesFromSortedList {

    public static void main(String[] args) {
        Node l1 = new Node(1).setNext(new Node(1).setNext(new Node(2).setNext(new Node(3).setNext(new Node(3)))));
        Node node = deleteDuplicates(l1);
        Util.print(node.toString());
    }

    public static Node deleteDuplicates(Node head) {
        if (head == null) {
            return head;
        }
        Node currNode = head;
        while (currNode.next!=null) {
            if (currNode.val==currNode.next.val) {
                currNode.next = currNode.next.next;
            } else {
                currNode = currNode.next;
            }
        }
        return head;
    }

}
