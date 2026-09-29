class Solution {
    public int majorityElement(int[] nums) {
        int maj=0;
        int res=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int num:nums)
        {
            map.put(num,map.getOrDefault(num,0)+1);
            if(map.get(num)>maj)
            {
               res=num;
               maj=map.get(num);
            }
        }return res;
    }
}