# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def sortList(self, head):
        """
        :type head: Optional[ListNode]
        :rtype: Optional[ListNode]
        """
        temp=head
        lst=[]
        while temp:
            lst.append(temp.val)
            temp=temp.next
        
        lst.sort()
        dummy=ListNode(0)
        curr=dummy
        for x in lst:
            curr.next=ListNode(x)
            curr=curr.next

        return dummy.next
