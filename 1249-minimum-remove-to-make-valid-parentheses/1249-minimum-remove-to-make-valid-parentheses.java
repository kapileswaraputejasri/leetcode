class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder str=new StringBuilder();
        int bal=0;
        for(char ch:s.toCharArray())
        {
            if(Character.isLetter(ch))
            {
                str.append(ch);
            }
            else if(ch=='(')
            {
                    str.append(ch);
                    bal++;
            }
            else
            {
                if (bal > 0) {
                    bal--;
                    str.append(ch);
                }
             }
        }
           for(int i=str.length()-1;i>=0&&bal>0;i--)
           {
            if(str.charAt(i)=='(')
            {
                str.deleteCharAt(i);
                bal--;
            }
           }
        return str.toString();
    }
}