class Solution {
    public List<Integer> lexicalOrder(int n) {
        String str[]=new String[n];
        for(int i=1;i<=n;i++){
            str[i-1]=String.valueOf(i);
        }

        Arrays.sort(str,(a,b)->{
           return a.compareTo(b);
            // if(k==0) return a.length()-b.length();
            // return k;
            });

        List<Integer> list=new ArrayList<>();
        for(String s:str)
        list.add(Integer.parseInt(s));

        return list;
    }
}