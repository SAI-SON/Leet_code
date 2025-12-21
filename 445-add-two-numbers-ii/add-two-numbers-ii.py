# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def addTwoNumbers(self, l1, l2):
        """
        :type l1: Optional[ListNode]
        :type l2: Optional[ListNode]
        :rtype: Optional[ListNode]
        """
        str1=str2=""
        temp1,temp2=l1,l2
        while temp1:
            str1+=str(temp1.val)
            temp1=temp1.next
        while temp2:
            str2+=str(temp2.val)
            temp2=temp2.next
        res=str(int(str1)+int(str2)) 
        dummy=ListNode(0)
        t=dummy
        for x in res:
            t.next=ListNode(int(x))
            t=t.next
        return dummy.next
