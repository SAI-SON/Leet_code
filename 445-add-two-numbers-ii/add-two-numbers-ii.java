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
import java.math.*;
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // List<Integer> list1=new ArrayList<>();
        // List<Integer> list2=new ArrayList<>();
        String str1="",str2="";
        ListNode temp1=l1;
        ListNode temp2=l2;
        while(temp1!=null){
            str1+=String.valueOf(temp1.val);
            temp1=temp1.next;
        }
        while(temp2!=null){
            str2+=String.valueOf(temp2.val);
            temp2=temp2.next;
        }
        String res=String.valueOf(new BigInteger(str1)
                                    .add(new BigInteger(str2)));
        ListNode dummy=new ListNode(0);
        ListNode t=dummy;
        for(char c:res.toCharArray()){
            t.next=new ListNode(c-'0');
            t=t.next;
        }
        return dummy.next;
        
    }
}