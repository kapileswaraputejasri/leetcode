class Solution {
    public double findMaxAverage(int[] nums, int k) {
        long sum=0;
        long max=Integer.MIN_VALUE;
        int i=0;
        for(int j=0;j<nums.length;j++)
        {
            sum+=nums[j];
            if(j-i+1>k)
            {
                sum-=nums[i];
                i++;
            } if(j-i+1==k)
            {
                max=Math.max(max,sum);
            }
        }return (double)max/k;
    }
}