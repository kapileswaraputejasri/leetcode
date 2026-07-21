class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=0;
        for(int i=0;i<candies.length;i++)
        {
            max=Math.max(max,candies[i]);
        }
         List<Boolean> candy=new ArrayList<>();
        for(int ca:candies)
        {
            if(ca+extraCandies >=max)
            {
                candy.add(true);
            }
            else
            {
                candy.add(false);
            }
        }return candy;
    }
}