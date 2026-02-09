# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def partition(self, head, x):
        """
        :type head: Optional[ListNode]
        :type x: int
        :rtype: Optional[ListNode]
        """
        d1=dummy1=ListNode(0)
        d2=dummy2=ListNode(0)
        while head:
            if head.val<x:
                d1.next=head
                d1=d1.next
            else:
                d2.next=head
                d2=d2.next
            head=head.next
        d2.next=None
        d1.next=dummy2.next
        return dummy1.next