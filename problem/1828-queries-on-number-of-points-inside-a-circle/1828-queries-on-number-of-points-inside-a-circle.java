class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        int[] ans=new int[queries.length];
        int count;
        for(int i=0;i<queries.length;i++){
            count=0;
            for(int j=0;j<points.length;j++){
                if(((int)Math.pow((points[j][0]-queries[i][0]),2)
                 +(int)Math.pow((points[j][1]-queries[i][1]),2))
                 <=(int)Math.pow(queries[i][2],2)){
                    count++;
                 }
            }
            ans[i]=count;
        }
        return ans;
    }
}