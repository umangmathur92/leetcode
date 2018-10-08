package lc83_RemoveDuplicatesFromSortedList;

import Node.ListNode;
import Utils.Util;

public class RemoveDuplicatesFromSortedList {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1).setNext(new ListNode(1).setNext(new ListNode(2).setNext(new ListNode(3).setNext(new ListNode(3)))));
        ListNode listNode = deleteDuplicates(l1);
        Util.print(listNode.toString());
    }

    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode currNode = head;
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
