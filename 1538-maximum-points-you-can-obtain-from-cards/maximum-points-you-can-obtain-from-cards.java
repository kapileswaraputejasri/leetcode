class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int sum=0;
        int n=cardPoints.length;
        int ws=n-k;
        for(int j=0;j<n;j++)
        {
            sum+=cardPoints[j];
        }
        if(k==n)
        {
            return sum;
        }
         int min=Integer.MAX_VALUE;
         int i=0;
         int window=0;
        for(int j=0;j<n;j++)
        {
               window+=cardPoints[j];
            
             if(j-i+1>n-k) { 
                window-=cardPoints[i];
                i++;
            }
            if(j-i+1==ws)
            {
               min=Math.min(min,window);
            }
        }
            
        return sum-min;
    }
}