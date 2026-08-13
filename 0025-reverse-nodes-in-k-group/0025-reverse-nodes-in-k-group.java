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
    List<Integer> list=new ArrayList<>();
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp=head;
        while(temp!=null){
            list.add(temp.val);
            temp=temp.next;
        }
        for(int i=k-1;i<list.size();i+=k){
            rev(i-k+1,i);
        }
        //System.out.println(list);
        ListNode dummy=new ListNode(0);
        temp=dummy;
        for(int i=0;i<list.size();i++){
            temp.next=new ListNode(list.get(i));
            temp=temp.next;
        }
        return dummy.next;
        
    }
    void rev(int start,int end){
        int left=start;
        int right=end;
        while(left<right){
            int temp=list.get(left);
            list.set(left,list.get(right));
            list.set(right,temp);
            left++;
            right--;
        }
    }
}