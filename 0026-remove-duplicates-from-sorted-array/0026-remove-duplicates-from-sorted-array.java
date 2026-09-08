class Solution {
    public int removeDuplicates(int[] nums) {
      int first=1;
      for(int last=1;last<nums.length;last++)
      {
        if(nums[first-1] != nums[last])
        {
            
            nums[first]=nums[last];
            first++;
        }
      }return first;
    }
}