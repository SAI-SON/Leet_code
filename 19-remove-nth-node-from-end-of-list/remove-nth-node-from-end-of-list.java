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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        List<Integer> list=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            list.add(temp.val);
            temp=temp.next;
        }
        if(list.size()>=n){
            list.remove(list.size()-n);
        }
        ListNode dummy=new ListNode(0);
        ListNode t=dummy;
        for(int l:list){
            t.next=new ListNode(l);
            t=t.next;
        }
        return dummy.next;
    }
}