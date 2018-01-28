package org.yidafu.leetcode;
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(-1);
        ListNode resultIndex = result;
        while( l1 != null && l2 != null ){
            resultIndex.next = new ListNode( l1.val + l2.val );
            resultIndex = resultIndex.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        while( l1 != null ) {
            resultIndex.next = new ListNode( l1.val );
            l1 = l1.next;
            resultIndex = resultIndex.next;
        }
        while( l2 != null ) {
            resultIndex.next = new ListNode( l2.val );
            l2 = l2.next;
            resultIndex = resultIndex.next;
        }
        resultIndex = result ;
        while (resultIndex != null ) {
            if( resultIndex.val > 9 ) {
                if( resultIndex.next == null ) {
                    resultIndex.next = new ListNode( 1 );
                } else {
                    resultIndex.next.val += 1;
                }
                resultIndex.val %= 10;
            }
            resultIndex = resultIndex.next;
        }
        return  result.next;
    }
}
