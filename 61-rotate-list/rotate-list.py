# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def rotateRight(self, head, k):
        """
        :type head: Optional[ListNode]
        :type k: int
        :rtype: Optional[ListNode]
        """
        if not head or not head.next or k==0:
            return head
        temp=head
        lst=[]
        while temp:
            lst.append(temp.val)
            temp=temp.next

        n = len(lst)
        k=k%n
        if k==0:
            return head
        rotate=lst[-k:]+lst[:-k]
        dummy=ListNode(0)
        t=dummy
        for x in rotate:
            t.next=ListNode(x)
            t=t.next
        return dummy.next
        