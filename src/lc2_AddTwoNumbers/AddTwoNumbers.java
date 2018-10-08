package lc2_AddTwoNumbers;

import Node.ListNode;
import Utils.Util;

public class AddTwoNumbers {

    public static void main(String[] args) {
        /*
        Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
        Output: 7 -> 0 -> 8
         */
        ListNode l1 = new ListNode(2).setNext(new ListNode(4).setNext(new ListNode(3)));
        ListNode l2 = new ListNode(5).setNext(new ListNode(6).setNext(new ListNode(4)));
        ListNode l3 = addTwoNumbers(l1, l2);
        Util.print(l3.toString());
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode currNode = dummyHead;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int val1 = (l1 == null) ? 0: l1.val;
            int val2 = (l2 == null) ? 0: l2.val;
            int sum = carry + val1 + val2;
            carry = sum / 10;
            int val = sum % 10;
            currNode.next = new ListNode(val);
            currNode = currNode.next;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        if(carry > 0) {
            currNode.next = new ListNode(carry);
        }
        return dummyHead.next;
    }

    private static StringBuffer getIntegerStrFromNode(ListNode listNode) {
        StringBuffer str = new StringBuffer();
        while (listNode.next != null) {
            str.append(listNode.val);
            listNode = listNode.next;
        }
        return str.append(listNode.val).reverse();
    }

}
