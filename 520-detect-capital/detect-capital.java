class Solution {
    public boolean detectCapitalUse(String word) {
       int uppercount=0;
       for(int i=0;i<word.length();i++)
       {
        if(Character.isUpperCase(word.charAt(i)))
        {
            uppercount++;
        }
       }return uppercount==0||uppercount==word.length()||(uppercount==1 &&Character.isUpperCase(word.charAt(0)));
    }
}