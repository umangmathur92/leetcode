package lc21_MergeTwoSortedLists;

import Utils.Util;
import Node.Node;

public class MergeTwoSortedLists {

    public static void main(String[] args) {
        Node l1 = new Node(2).setNext(new Node(4)).setNext(new Node(7));
        Node l2 = new Node(1).setNext(new Node(5)).setNext(new Node(9));
        Node mergedList = mergeTwoLists(l1, l2);
        Util.print(mergedList.toString());
    }

    private static Node mergeTwoLists(Node l1, Node l2) {
        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        }
        if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l2.next, l1);
            return l2;
        }
    }

}