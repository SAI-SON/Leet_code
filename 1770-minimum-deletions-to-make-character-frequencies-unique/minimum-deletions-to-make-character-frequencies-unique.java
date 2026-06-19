class Solution {
    public int minDeletions(String s) {
        int arr[]=new int[26];
        for(int c:s.toCharArray()){
            arr[c-'a']++;
        }
        Arrays.sort(arr);
        Set<Integer>set=new HashSet<>();
        int c=0;

        for(int i=0;i<arr.length;i++){
            while(set.contains(arr[i]) && arr[i]!=0){
                c++;
                arr[i]--;
            }
            set.add(arr[i]);
        }
        return c;
    }
}