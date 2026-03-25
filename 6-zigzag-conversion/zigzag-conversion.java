class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1 || s.length()<=numRows)
        return s;

        StringBuilder res[]=new StringBuilder[numRows];

        for(int i=0;i<numRows;i++){
            res[i] = new StringBuilder();
        }
        int in=0;
        int st=1;
        for(char c:s.toCharArray()){
            res[in].append(c);
            if(in==0){
                st=1;
            }else if(in==numRows-1){
                st=-1;
            }
            in+=st;
        }

        StringBuilder sb=new StringBuilder();
        for(int i=0;i<numRows;i++){
            sb.append(res[i]);
        }
        return sb.toString();
    }
}