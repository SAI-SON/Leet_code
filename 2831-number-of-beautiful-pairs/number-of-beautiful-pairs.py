class Solution(object):
    def gcd(self,a,b):
        if b==0: return a
        return self.gcd(b,a%b)
    def countBeautifulPairs(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        c=0
        for i in range(len(nums)):
            first=int(str(nums[i])[0])
            for j in range(i+1,len(nums)):
                if(self.gcd(first,nums[j]%10)==1): c+=1
        return c
        