class Solution:
    def smallestSubsequence(self, s):
        fre = [0] * 26
        for c in s:
            fre[ord(c)-ord('a')]+=1

        visit=[False]*26
        sb=[]

        for c in s:
            fre[ord(c)-ord('a')]-= 1
            if visit[ord(c)-ord('a')]:
                continue
            while sb:
                top=sb[-1]

                if c < top and fre[ord(top) - ord('a')] > 0:
                    sb.pop()
                    visit[ord(top) - ord('a')]=False
                else:
                    break
            sb.append(c)
            visit[ord(c)-ord('a')] = True

        return ''.join(sb)