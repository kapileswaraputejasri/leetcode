class Solution {
    public int maximumLengthSubstring(String s) {
        int[] f=new int[26];
        int i=0;int max=0;
        for(int j=0;j<s.length();j++)
        {
            f[s.charAt(j)-'a']++;
            while(f[s.charAt(j)-'a']>2)
            {
                f[s.charAt(i)-'a']--;
                i++;
            }
            max=Math.max(max,j-i+1);
        }return max;
    }
}