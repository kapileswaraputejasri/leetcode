class Solution {
    public int numIdenticalPairs(int[] nums) {
        int[] freq=new int[101];
        for(int i=0;i<nums.length;i++)
        {
            freq[nums[i]]++;
        }
        int count=0;int sum=0;
        for(int f:freq)
        {
            sum+=(f*(f-1))/2;
        }
     return sum;
    }
}