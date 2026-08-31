class Solution {
    public int arrangeCoins(int n) {
       int low=0;int high=n;
       int ans=1;
       while(low<=high)
       {
        int mid=(low+high)/2;
        if(staircase(mid)<=n)
        {
            ans=mid;
            low=mid+1;
        }
        else
        {
            high=mid-1;
        }
       }return ans;
    }
    private long staircase(int mid)
    {
        long sum=(long)mid*(mid+1)/2;
        return  sum;
    }
}