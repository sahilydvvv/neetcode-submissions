class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        int l = 0;
        ListNode temp = head;
        while (temp != null) {
            l++;
            temp = temp.next;
        }
        int c = l / k;
        ListNode lst = new ListNode();
        ListNode list = lst;
        while (c-- > 0) {
            int count = k;
            ListNode prev = null;
            ListNode curr = head;
            while (count-- > 0) {
                ListNode next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            list.next = prev;
            head.next = curr;
            list = head;
            head = curr;
        }
        return lst.next;
    }
}