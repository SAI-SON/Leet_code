class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int arr[]=new int[spells.length];
        for(int i=0;i<spells.length;i++){
           int start=0,end=potions.length-1;
           int res=-1;
           while(start<=end){
            int mid=(start+end)/2;
            if((long)potions[mid]*spells[i]>=(long)success){
                end=mid-1;
                res=mid;
            }
            else{
                start=mid+1;
            }
           }
            arr[i]=(res==-1)?0:(potions.length-res);
        }
        return arr;
    }
}