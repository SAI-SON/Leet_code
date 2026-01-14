public class Solution {
    public string ReversePrefix(string s, int k) {
char[] arr = s.Substring(0, k).ToCharArray();
        Array.Reverse(arr);
        return new string(arr)+s.Substring(k);
    }
}