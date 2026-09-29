class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int count=1;
        for(int num:nums)
        {
            map.put(num,map.getOrDefault(num,0)+1);
            if(map.get(num)>count)
            {
                return true;
            }
        }return false;
    }
}