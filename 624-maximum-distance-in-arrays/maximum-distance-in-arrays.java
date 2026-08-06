class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int min=arrays.get(0).get(0);
        int max=arrays.get(0).get(arrays.get(0).size()-1);
        int ans=0;
        for(int i=1;i<arrays.size();i++)
        {
            List<Integer>row=arrays.get(i);
            int  currmin=row.get(0);
            int  currmax=row.get(row.size()-1);
             ans=Math.max(ans,Math.max(currmax-min,max-currmin));
        
        min=Math.min(currmin,min);
        max=Math.max(currmax,max);
        }
        return ans;
    }
}