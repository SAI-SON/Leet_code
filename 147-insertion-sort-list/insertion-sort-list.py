# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def insertionSortList(self, head):
        """
        :type head: Optional[ListNode]
        :rtype: Optional[ListNode]
        """
        temp=head
        while temp:
            temp2=temp
            minn=temp
            while temp2:
                if temp2.val<minn.val:
                    minn=temp2
                temp2=temp2.next
            val=minn.val
            minn.val=temp.val
            temp.val=val
            temp=temp.next
        return head