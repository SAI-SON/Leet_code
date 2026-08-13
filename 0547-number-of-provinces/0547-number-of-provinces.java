class Solution {
    List<List<Integer>> adjList=new ArrayList<>();
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
         for(int i=0;i<n;i++){
            adjList.add(new ArrayList<>());
         }
         for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(isConnected[i][j]==1 && i!=j){
                adjList.get(i).add(j);
                adjList.get(j).add(i);
                }
            }
        }
        int c=0;
        boolean []visit=new boolean[n];
        for(int i=0;i<n;i++){
            if(!visit[i]){
                c++;
                dfs(i,visit);
            }
        }
        return c;
    }
    void dfs(int val,boolean visit[]){
        visit[val]=true;
        for(int i=0;i<adjList.get(val).size();i++){
            if(!visit[adjList.get(val).get(i)]){
                dfs(adjList.get(val).get(i),visit);
            }
        }
    }
    
}