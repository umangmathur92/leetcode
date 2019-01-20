package lc2_AddTwoNumbers;

import Node.Node;
import Utils.Util;

public class AddTwoNumbers {

    public static void main(String[] args) {
        /*
        Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
        Output: 7 -> 0 -> 8
         */
        Node l1 = new Node(2).setNext(new Node(4).setNext(new Node(3)));
        Node l2 = new Node(5).setNext(new Node(6).setNext(new Node(4)));
        Node l3 = addTwoNumbers(l1, l2);
        Util.print(l3.toString());
    }

    public static Node addTwoNumbers(Node l1, Node l2) {
        Node dummyHead = new Node(0);
        Node currNode = dummyHead;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int val1 = (l1 == null) ? 0: l1.val;
            int val2 = (l2 == null) ? 0: l2.val;
            int sum = carry + val1 + val2;
            carry = sum / 10;
            int val = sum % 10;
            currNode.next = new Node(val);
            currNode = currNode.next;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        if(carry > 0) {
            currNode.next = new Node(carry);
        }
        return dummyHead.next;
    }

    private static StringBuffer getIntegerStrFromNode(Node node) {
        StringBuffer str = new StringBuffer();
        while (node.next != null) {
            str.append(node.val);
            node = node.next;
        }
        return str.append(node.val).reverse();
    }

}
