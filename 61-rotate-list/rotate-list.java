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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode temp=head;
        List<Integer> list=new ArrayList<>();

        while(temp!=null){
            list.add(temp.val);
            temp=temp.next;            
        }
        // k%=list.size();
        Collections.rotate(list,k);
        ListNode dummy=new ListNode(0);
        ListNode t=dummy;
        for(int l:list){
            t.next=new ListNode(l);
            t=t.next;
        }
        return dummy.next;
    }
}