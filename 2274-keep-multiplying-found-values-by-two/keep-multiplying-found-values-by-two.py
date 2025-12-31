class Solution(object):
    def findFinalValue(self, nums, original):
        """
        :type nums: List[int]
        :type original: int
        :rtype: int
        """
        def search(nums,target):
            for i in nums:
                if i==target:
                    return True
            return False

        while(search(nums,original)):
            original*=2
        return original       