/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @return {number[]}
 */
var nextLargerNodes = function(head) {
    let lst=[];
    while(head!==null){
        lst.push(head.val);
        head=head.next;
    }
    let arr=new Array(lst.length).fill(0);
    for(let i=0;i<lst.length;i++){
        for(let j=i+1;j<lst.length;j++){
            if(lst[i]<lst[j]){
                arr[i]=lst[j];
                break;
            }
        }
    }
    return arr;
};