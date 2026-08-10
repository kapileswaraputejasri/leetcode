class Solution {
    public int maximumCount(int[] nums) {
       int negcount=binary(nums,0);
       int poscount=nums.length-binary(nums,1);
       return Math.max(negcount,poscount);
    }
    private int binary(int[] nums,int target)
    {
        int left=0;int right=nums.length-1;int result=nums.length;
        while(left<=right)
        {
            int mid=(left+right)/2;
            if(nums[mid]<target)
            {
                left=mid+1;
            }
            else
            {
                result=mid;
                right=mid-1;
            }
        }return result;
    }
}