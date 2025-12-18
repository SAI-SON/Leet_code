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
    public ListNode swapPairs(ListNode head) {
        List<Integer> list=new ArrayList<>();
        ListNode temp=head;
       
        while(temp!=null){
            list.add(temp.val);
            temp=temp.next;
        }

        for(int i=1;i<list.size();i+=2){
            int tempadd=list.get(i-1);
            list.set(i-1,list.get(i));
            list.set(i,tempadd);
        }

        ListNode dummy=new ListNode(0);
        ListNode t=dummy;
        for(int i:list){
            t.next=new ListNode(i);
            t=t.next;
        }
        return dummy.next;

    }
}