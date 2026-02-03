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
var insertionSortList = function(head) {
    let temp=head;
    while(temp!=null){
        let temp2=temp;
        let min=temp;
        while(temp2!=null){
            if(temp2.val<min.val){
                min=temp2;
            }
            temp2=temp2.next;
        }
        let val=temp.val;
        temp.val=min.val;
        min.val=val;
        temp=temp.next;
    }
    return head;
};