class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int n=nums.length;
        if(nums.length==1 || index.length==1)
        {
            return nums;
        }
        List<Integer> arr=new ArrayList<>();
            int i = 0;
            for(int j=0;j<index.length;j++)
            {

                    arr.add(index[j],nums[i]);
                    i++;
                }
            
        
        int res[] = new int[arr.size()];
        for(int k = 0; k<arr.size();k++)
        {
            res[k] = arr.get(k);
        }return res;
    }
}