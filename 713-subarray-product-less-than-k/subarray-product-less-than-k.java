class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int res=0;
        int i=0;
        int pro=1;
        if(k<=1)
        {
            return 0;
        }
            for(int j=0;j<nums.length;j++)
            {
                pro*=nums[j];
                while(pro>=k)
                {
                    pro/=nums[i];
                    i++;
                }
                res+=j-i+1;
            }return res;
        
    }
}