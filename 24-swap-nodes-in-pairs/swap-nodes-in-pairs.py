# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def swapPairs(self, head):
        """
        :type head: Optional[ListNode]
        :rtype: Optional[ListNode]
        """
        temp=head
        lst=[]
        while temp:
            lst.append(temp.val)
            temp=temp.next
        for i in range(1,len(lst),2):
            lst[i-1],lst[i]=lst[i],lst[i-1]

        dummy=ListNode(0)
        t=dummy
        for x in lst:
            t.next=ListNode(x)
            t=t.next
        return dummy.next
        