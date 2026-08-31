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
       String str1="";
       String str2="";
    //    ListNode temp=l1;
        while(l1!=null){
            str1=l1.val+str1;
            l1=l1.next;
        }
        while(l2!=null){
            str2=l2.val+str2;
            l2=l2.next;
        }
        BigInteger res1=new BigInteger(str1);
        BigInteger res2=new BigInteger(str2);
        BigInteger res=res1.add(res2);

        String sb=new StringBuilder(String.valueOf(res)).reverse().toString();
        // System.out.println(sb+" ");
        ListNode head=new ListNode(sb.charAt(0)-'0');
        ListNode f=head;
        for(int i=1;i<sb.length();i++){
            ListNode t=new ListNode(sb.charAt(i)-'0');
            head.next=t;
            head=head.next;
        }
        return f;
    }
}