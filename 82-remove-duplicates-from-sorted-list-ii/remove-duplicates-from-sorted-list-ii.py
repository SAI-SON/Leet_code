# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def deleteDuplicates(self, head):
        """
        :type head: Optional[ListNode]
        :rtype: Optional[ListNode]
        """
        set1=set()
        set2=set()
        temp=head
        while temp:
            if temp.val in set1:
                set2.add(temp.val)
            else:
                set1.add(temp.val)
            temp=temp.next
        
        temp=head

        dummy=ListNode(0)
        t=dummy
        while temp:
            if temp.val not in set2:
                t.next=ListNode(temp.val)
                t=t.next
            temp=temp.next
        
        return dummy.next