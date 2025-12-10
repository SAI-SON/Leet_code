# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def removeElements(self, head, val):
        """
        :type head: Optional[ListNode]
        :type val: int
        :rtype: Optional[ListNode]
        """
        temp=head
        lst=[]
        while temp:
            lst.append(temp.val) if temp.val!=val else 0
            temp=temp.next
        
        dummy=ListNode(0)
        t=dummy
        for x in lst:
            t.next=ListNode(x)
            t=t.next
        return dummy.next