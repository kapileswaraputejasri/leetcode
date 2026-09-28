class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] lsum=new int[nums.length];
        int[] rsum=new int[nums.length];
        int[] ans=new int[nums.length];
        lsum[0]=0;
        rsum[nums.length-1]=0;
        int sum=0,sum1=0;
        for(int i=0;i<nums.length-1;i++)
        {
            sum+=nums[i];
            lsum[i+1]=sum;
        }
         for(int i=nums.length-1;i>0;i--)
        {
            sum1+=nums[i];
            rsum[i-1]=sum1;
        }
        for(int i=0;i<nums.length;i++)
        {
            ans[i]=Math.abs(lsum[i]-rsum[i]);
        }return ans;
    }
}