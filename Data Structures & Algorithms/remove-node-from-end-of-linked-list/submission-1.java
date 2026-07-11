/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.next = next; this.val = val; }
 * }
 */

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int l = 0;
        ListNode temp = head;
        while (temp != null) {
            l++;
            temp = temp.next;
        }
        if (l == n) {
            return head.next;
        }
        int c = l - n;
        temp = head;
        int val = 0;
        while (temp != null) {
            if (val == c - 1) {
                temp.next = temp.next.next;
                break;
            }
            temp = temp.next;
            val++;
        }
        return head;
    }
}