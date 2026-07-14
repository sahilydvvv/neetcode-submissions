class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode lst = new ListNode();
        ListNode temp = lst;

        int carry = 0;
        int sum = 0;

        while (l1 != null && l2 != null) {
            int val1 = l1.val;
            int val2 = l2.val;

            sum = val1 + val2 + carry;

            carry = sum / 10;
            sum = sum % 10;

            temp.next = new ListNode(sum);
            temp = temp.next;

            l1 = l1.next;
            l2 = l2.next;
        }

        while (l1 != null) {
            sum = l1.val + carry;

            carry = sum / 10;
            sum = sum % 10;

            temp.next = new ListNode(sum);
            temp = temp.next;

            l1 = l1.next;
        }

        while (l2 != null) {
            sum = l2.val + carry;

            carry = sum / 10;
            sum = sum % 10;

            temp.next = new ListNode(sum);
            temp = temp.next;

            l2 = l2.next;
        }

        if (carry > 0) {
            temp.next = new ListNode(carry);
        }

        return lst.next;
    }
}