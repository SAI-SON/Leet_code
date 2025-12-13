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
    public ListNode deleteDuplicates(ListNode head) {
        Set<Integer> set1=new LinkedHashSet<>();
        Set<Integer> set2=new LinkedHashSet<>();
        ListNode temp=head;
        while (temp!=null){
            if(!set1.add(temp.val)){
                set2.add(temp.val);
            }
            temp=temp.next;
        }
        set1.removeAll(set2);
        ListNode dummy=new ListNode(0);
        ListNode t=dummy;
        for(int s:set1){
            t.next=new ListNode(s);
            t=t.next;
        }
        return dummy.next;

    }
}