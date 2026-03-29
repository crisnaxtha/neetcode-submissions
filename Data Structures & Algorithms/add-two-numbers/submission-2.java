/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode c1 = l1;
        ListNode p1 = null;

        while(c1 != null) {
            ListNode temp = c1.next;
            c1.next = p1;
            p1 = c1;
            c1 = temp;
        }
        String s1 = "";
        while(p1 != null) {
            s1 = s1 + p1.val;
            p1 = p1.next;
        }
        ListNode c2 = l2;
        ListNode p2 = null;

        while(c2 != null) {
            ListNode temp = c2.next;
            c2.next = p2;
            p2 = c2;
            c2 = temp;
        }
        String s2 = "";
        while(p2 != null) {
            s2 = s2 + p2.val;
            p2 = p2.next;
        }
        System.out.println(Integer.parseInt(s2));
        int sum = Integer.parseInt(s1) + Integer.parseInt(s2);
        System.out.println(sum);
        ListNode res = null;
        ListNode p3 = null;
        if(sum == 0) {
            p3 = new ListNode(0, null);
        } else {
            while(sum > 0) {
                res = new ListNode(sum % 10, res);
                sum = sum / 10;
            }
            ListNode c3 = res;
            
            while(c3 != null) {
                ListNode temp = c3.next;
                c3.next = p3;
                p3 = c3;
                c3 = temp;
            }
        }
        return p3;
    }
}
