class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] list={-1,-1};
        int left=isbinary(nums,target,true);
        int right=isbinary(nums,target,false);
        list[0]=left;
        list[1]=right;
        return list;
    }
    private static int isbinary(int[] nums,int target,boolean isbinaryleft){
        int left=0;
        int right=nums.length-1;
        int idx=-1;
        while(left<=right)
        {
            int mid=(left+right)/2;
           if(nums[mid]>target)
            {
                right=mid-1;
            }
            else if(nums[mid]<target)
            {
                left=mid+1;
            }
            else
            {
                idx=mid;
                if(isbinaryleft)
                {
                    right=mid-1;
                }
                else
                {
                    left=mid+1;
                }
            }
        }
    return idx;
    }
}