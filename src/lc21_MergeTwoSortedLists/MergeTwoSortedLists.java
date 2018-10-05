package lc21_MergeTwoSortedLists;

import Utils.Util;
import lc2_AddTwoNumbers.ListNode;

public class MergeTwoSortedLists {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2).setNext(new ListNode(4)).setNext(new ListNode(7));
        ListNode l2 = new ListNode(1).setNext(new ListNode(5)).setNext(new ListNode(9));
        ListNode mergedList = mergeTwoLists(l1, l2);
        Util.print(mergedList.toString());
    }

    private static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
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