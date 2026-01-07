class Solution {
    public int numSpecial(int[][] mat) {
        int count=0;
        for(int []row:mat){
            if(rowsum(row)==1){
                count+=(getcolumnsum(mat,getindex(row))==1)?1:0;
            }
        }
        return count;
    }
    public static int rowsum(int row[]){
        return Arrays.stream(row).sum();
    }
    public static int getindex(int row[]){
        for(int i=0;i<row.length;i++){
            if(row[i]==1) return i;
        }
        return -1;
    }
    public static int getcolumnsum(int mat[][],int index){
        int sum=0;
        for(int row[]:mat){
            sum+=row[index];
        }
        return sum;
    }
}