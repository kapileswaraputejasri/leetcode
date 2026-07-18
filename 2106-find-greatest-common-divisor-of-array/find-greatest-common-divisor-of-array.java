class Solution {
    public int findGCD(int[] nums) {
        int mn=nums[0];
        int mx=nums[0];
        int div=0;
        for(int i=0;i<nums.length;i++)
        {
           mn=Math.min(mn,nums[i]);
           mx=Math.max(mx,nums[i]);
        }
        int d=mn;
        while(d>0)
        {
         if( mn%d==0&& mx%d==0)
        {
           return d;
        }
            d--;
            
        }return 1;
    }
}