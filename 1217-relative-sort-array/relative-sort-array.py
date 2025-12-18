class Solution(object):
    def relativeSortArray(self, arr1, arr2):
        """
        :type arr1: List[int]
        :type arr2: List[int]
        :rtype: List[int]
        """
        mp={}
        for x in arr1:
            mp[x]=mp.get(x,0)+1
        lst=[]
        for x in arr2:
            lst.extend([x]*mp[x])
            mp[x]=0
        
        for x in sorted(mp.keys()):
            if mp[x]!=0:
                lst.extend([x]*mp[x])

        return lst
