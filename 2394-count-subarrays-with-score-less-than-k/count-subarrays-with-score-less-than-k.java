class Solution {
    public long countSubarrays(int[] nums, long k) {
        long count=0;
        long res=0;
        for(int i=0,j=0;j<nums.length;j++)
        {
            count+=nums[j];
            while(i<=j && count*(j-i+1)>=k)
            {
                count-=nums[i];
                i++;
            }
            res+=j-i+1;
        }return res;
    }
}