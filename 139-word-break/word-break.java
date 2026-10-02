class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp=new boolean[s.length()+1];
        HashSet<String>set=new HashSet<>(wordDict);
        dp[0]=true;
        for(int i=0;i<=s.length();i++)
        {
            for(int j=0;j<i;j++)
            {
                String word=s.substring(j,i);
                if(dp[j] && set.contains(word))
                {
                    dp[i]=true;
                    break;
                }
            }
        }return dp[s.length()];
    }
}