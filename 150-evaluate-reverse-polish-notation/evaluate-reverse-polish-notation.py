class Solution(object):
    def evalRPN(self, tokens):
        """
        :type tokens: List[str]
        :rtype: int
        """
        stack = []
        for ch in tokens:
            if ch not in "+-*/":
                stack.append(int(ch))
            else:
                b = stack.pop()
                a = stack.pop()
                if ch == "+":
                    stack.append(a+b)
                elif ch == "-":
                    stack.append(a-b)
                elif ch == "*":
                    stack.append(a*b)
                else:
                    stack.append(int(float(a)/b))
        return stack.pop()