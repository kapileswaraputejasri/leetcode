class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1)return 0;
        int count=0;
        int p=1;
        for(int i=0, j=0;j<nums.length;j++)
        {
            p*=nums[j];
            while(p>=k)
            {
                p/=nums[i];
                i++;
            }
            count+=j-i+1;
        }return count;
    }
}