class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int n=nums.length;
        if(n<3)return n;
        else{
            int ans=1;
            while(ans<=n)
            ans<<=1;
            return ans;
        }
    }
}