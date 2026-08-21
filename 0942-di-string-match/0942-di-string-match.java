class Solution {
    public int[] diStringMatch(String s) {
        int n=s.length();
        int left=0;
        int right=n;
        int arr[]=new int[n+1];
        int ind=0;

        for(char c:s.toCharArray()){
            if(c=='I'){
                arr[ind]=left;
                left++;
            }
            else{
                arr[ind]=right;
                right--;
            }
            ind++;
        }
        if(left<=right){
            arr[ind]=left;
        }
        return arr;
    }
}