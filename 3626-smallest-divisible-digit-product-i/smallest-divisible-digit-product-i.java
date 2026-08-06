class Solution {
    public int smallestNumber(int n, int t) {
        for(int i=n;i<=100;i++)
        {
            int pro=1;
            int temp=i;
            while(temp>0)
            {
                int digit=temp%10;
                pro*=digit;
                temp/=10;
            }
            if(pro%t==0)
            {
                return i;
            }
            
        }return n;
    }
}