class Solution(object):
    def countGoodTriplets(self, arr, a, b, c):
        """
        :type arr: List[int]
        :type a: int
        :type b: int
        :type c: int
        :rtype: int
        """
        n,count=len(arr),0
        for i in range(n):
            for j in range(i+1,n):
                for k in range(j+1,n):
                    count+=1 if (abs(arr[i]-arr[j])<=a and abs(arr[j]-arr[k])<=b and abs(arr[i]-arr[k])<=c) else 0
                        
        return count
        
        