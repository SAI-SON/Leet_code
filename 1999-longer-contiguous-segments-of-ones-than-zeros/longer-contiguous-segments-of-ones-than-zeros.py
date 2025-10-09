class Solution:
    def checkZeroOnes(self, s: str) -> bool:
        onemax,zeromax,cone,czero=0, 0, 0, 0
        for i in s:
            if i=="1":
                cone+=1
                czero=0
                onemax=max(onemax,cone)
            else:
                czero+=1
                cone=0
                zeromax=max(zeromax,czero)
        
        return onemax>zeromax


