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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp1=list1;
        ListNode temp2=list2;
        List<Integer> lst1=new ArrayList<>();
        List<Integer> lst2=new ArrayList<>();
        // List<Integer> res=new ArrayList<>();
        while(temp1!=null){
            lst1.add(temp1.val);
            temp1=temp1.next;
        }
         while(temp2!=null){
            lst2.add(temp2.val);
            temp2=temp2.next;
        }
        lst1.addAll(lst2);
        // for(int i=0;i<Math.max(list1.size(),list2.size());i++){
        //     if(i<list1.size()) res.add(list1.get(i));//1 2 4
        //     if(i<list2.size()) res.add(list2.get(i));//1 3 4
        // }
        Collections.sort(lst1);
        ListNode dummy=new ListNode(0);
        ListNode t=dummy;
        for(int l:lst1){
            t.next=new ListNode(l);
            t=t.next;
        }
        return dummy.next;        
    }
}