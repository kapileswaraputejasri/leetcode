class Solution {
    public boolean isGoodArray(int[] nums) {
        int ans=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            ans=gcd(ans,nums[i]);
        }
        if(ans==1)return true;
        return false;
    }
    public int gcd(int a,int b)
    {
        while(b!=0)
        {
            int temp=b;
            b=a%b;
            a=temp;
        }return a;
    }
}