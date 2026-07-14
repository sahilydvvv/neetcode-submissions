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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length ==0){
            return null;
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        ListNode lst = new ListNode();
        ListNode temp = lst;
        for(ListNode list : lists){
            while(list!=null){
                pq.add(list.val);
                list = list.next;
            }
        }
        while(!pq.isEmpty()){
            temp.next = new ListNode(pq.poll());
            temp = temp.next;
        }
        return lst.next;

    }
}
