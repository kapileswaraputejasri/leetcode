class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min=nums[0];
        int max=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            max=Math.max(max,nums[i]);
            min=Math.min(min,nums[i]);
        }
        List<Integer>res=new ArrayList<>();
        HashSet<Integer>set=new HashSet<>();
        for(int i:nums)
        {
            set.add(i);
        }
        for(int i=min;i<max;i++)
        {
            if(!set.contains(i))
            {
                res.add(i);
            }
        }return res;
    }
}