class Solution {
    public boolean judgeSquareSum(int c) {
        for(int a=0;(long)a*a<=c;a++)
        {
            int remaining=c-a*a;
        int low=0;
        int high=c;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            long res=(long)mid*mid;
            if(res==remaining)
            {
                return true;
            }
            else if(res>remaining)
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
    }return false;
    }
}