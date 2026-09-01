class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        Set<String>ban=new HashSet<>();
        for(String word:banned)
        {
            ban.add(word);
        }
        paragraph=paragraph.toLowerCase().replaceAll("[,?'.!;]"," ");
        String[] words=paragraph.split("\\s+");
        Map<String,Integer>map=new HashMap<>();
        String ans="";
        int maxcount=0;
        for(String word:words)
        {
            if(!ban.contains(word))
            {
                map.put(word,map.getOrDefault(word,0)+1);

                if(map.get(word)>maxcount)
                {
                    maxcount=map.get(word);
                    ans=word;
                }
            }
        }return ans;
    }
}