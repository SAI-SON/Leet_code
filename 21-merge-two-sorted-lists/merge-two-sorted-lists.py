# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def mergeTwoLists(self, list1, list2):
        """
        :type list1: Optional[ListNode]
        :type list2: Optional[ListNode]
        :rtype: Optional[ListNode]
        """
        temp1=list1
        temp2=list2
        lst1=[]
        lst2=[]
        while temp1:
            lst1.append(temp1.val)
            temp1=temp1.next

        while temp2:
            lst2.append(temp2.val)
            temp2=temp2.next

        lst1=lst1+lst2
        lst1.sort()

        dummy=ListNode(0)
        t=dummy
        for x in lst1:
            t.next=ListNode(x)
            t=t.next

        return dummy.next

