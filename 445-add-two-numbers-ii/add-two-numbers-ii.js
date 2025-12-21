/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} l1
 * @param {ListNode} l2
 * @return {ListNode}
 */
var addTwoNumbers = function(l1, l2) {
    let s1="",s2="";
    let temp1=l1,temp2=l2;
    while(temp1!==null){
        s1+=temp1.val;
        temp1=temp1.next;
    }
    while(temp2!==null){
        s2+=temp2.val;
        temp2=temp2.next;
    }

    res=(BigInt(s1)+BigInt(s2)).toString();
    let dummy=new ListNode(0);
    let t=dummy;
    for(let c of res){
        t.next=new ListNode(Number(c));
        t=t.next;
    }
    return dummy.next;
    };