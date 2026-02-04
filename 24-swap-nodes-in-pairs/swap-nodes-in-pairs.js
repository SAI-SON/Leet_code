/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @return {ListNode}
 */
var swapPairs = function(head) {
    let f=head;
    while(f!=null && f.next!=null){
        let val=f.val;
        f.val=f.next.val;
        f.next.val=val;
        f=f.next.next;
    }
    return head;
};