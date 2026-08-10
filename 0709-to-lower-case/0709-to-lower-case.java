class Solution {
    public String toLowerCase(String s) {
        String sb="";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch>='A' &&ch<='Z')
            {
                sb+=(char)(ch+32);
            }
            else
            {
                 sb+=ch;
            }
        }return sb;
    }
}