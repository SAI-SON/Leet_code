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
    public ListNode oddEvenList(ListNode head) {
        ListNode temp=head;
        List<Integer> oddlist=new ArrayList<>();
        List<Integer> evenlist=new ArrayList<>();
        int i=1;
        while(temp!=null){
            if(i%2==1){
            oddlist.add(temp.val);
            }
            else
            evenlist.add(temp.val);
            i++;
            temp=temp.next;
        }
        oddlist.addAll(evenlist);
        ListNode dummy=new ListNode(0);
        ListNode t=dummy;
        for(int val:oddlist){
            t.next=new ListNode(val);
            t=t.next;
        }
        return dummy.next;
    }
}