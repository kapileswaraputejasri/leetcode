class Solution {
    public int[] sortArray(int[] nums) {
        int[] ans=new int[2*50000+1];
        for(int num:nums)
        {
            ans[num+50000]++;
        }
        int write=0;
        for(int i=0;i<ans.length;i++)
        {
            int freq=ans[i];
            while(freq!=0)
            {
                nums[write]=i-50000;
                write++;
                freq--;
            }
        }return nums;
    }
}