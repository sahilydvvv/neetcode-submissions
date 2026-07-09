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
    public ListNode reverseList(ListNode head) {

        ListNode temp = head;
        ArrayList<Integer> lst = new ArrayList<>();

        while (temp != null) {
            lst.add(temp.val);
            temp = temp.next;
        }

        ListNode dummy = new ListNode();
        ListNode curr = dummy;

        for (int i = lst.size() - 1; i >= 0; i--) {
            curr.next = new ListNode(lst.get(i));
            curr = curr.next;
        }

        return dummy.next;
    }
}
