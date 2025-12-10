# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def pairSum(self, head):
        """
        :type head: Optional[ListNode]
        :rtype: int
        """
        temp=head
        lst=[]
        while temp:
            lst.append(temp.val)
            temp=temp.next

        m=0
        for i in range(0,len(lst)/2):
            sum=lst[i]+lst[len(lst)-i-1]
            m=max(m,sum)

        return m

        