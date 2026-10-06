class Solution {
    public int minSwaps(String s) {
     int bal=0;
     int maxbal=0;
     for(char ch:s.toCharArray())
     {
        if(ch== '[')
        {
            bal++;
        }
        else
        {
            bal--;
        }
        if(bal<0)
        {
            maxbal=Math.max(maxbal,-bal);
        }
     }return (maxbal+1)/2;
    }
}