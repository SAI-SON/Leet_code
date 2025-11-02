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
    public ListNode deleteMiddle(ListNode head) {
        if(head == null || head.next == null) return null;
        int c=0;
        ListNode temp=head;
        while(temp.next != null){
          temp=temp.next;
          c++;
        } 
        int mid=c/2;
        temp=head;
        for(int i=0;i<(c%2==0?mid-1:mid);i++){
            temp=temp.next;
        }
        temp.next = temp.next.next;
        return head;

    }
}