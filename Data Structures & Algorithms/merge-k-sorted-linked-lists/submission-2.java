class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }
        PriorityQueue<ListNode> pq =
                new PriorityQueue<>((a, b) -> a.val - b.val);
        for (ListNode list : lists){
            if (list != null) {
                pq.offer(list);
            }
        }
        ListNode dummy = new ListNode();
        ListNode temp = dummy;
        while (!pq.isEmpty()) {
            ListNode node = pq.poll();
            temp.next = node;
            temp = temp.next;
            if (node.next != null){
                pq.offer(node.next);
            }
        }
        return dummy.next;
    }
}