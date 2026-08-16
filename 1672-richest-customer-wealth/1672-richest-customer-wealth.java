class Solution {
    public int maximumWealth(int[][] accounts) {
        int res=0;
        for(int i=0;i<accounts.length;i++)
        {
             int ans=0;
            for(int j=0;j<accounts[i].length;j++){
            ans += accounts[i][j];
        }
        res=Math.max(res,ans);
        }return res;

    }
}