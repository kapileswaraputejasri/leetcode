class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count=0;
        HashSet<Character>set=new HashSet<>();
        for(char ch:jewels.toCharArray())
        {
            set.add(ch);
        }
        for( char c:stones.toCharArray())
        {
            if(set.contains(c))
            {
                count++;
            }
        }return count;
    }
}