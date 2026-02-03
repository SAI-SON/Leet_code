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
    public ListNode insertionSortList(ListNode head) {
        ListNode temp=head;
        while(temp!=null){
            ListNode min=temp;
            ListNode temp2=temp.next;
            while(temp2!=null){
                if(temp2.val<min.val){
                    min=temp2;
                }
                temp2=temp2.next;
            }
            int val=temp.val;
            temp.val=min.val;
            min.val=val;
            temp=temp.next;
        }
        return head;
    }
}