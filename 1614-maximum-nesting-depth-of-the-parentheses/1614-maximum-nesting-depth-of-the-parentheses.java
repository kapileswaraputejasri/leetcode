class Solution {
    public int maxDepth(String s) {
        int count=0;
        Stack<Character>st=new Stack<Character>();
        for(char ch:s.toCharArray())
        {
            if(ch=='(')
            {
                st.push(ch);
            }
            else if(ch ==')')
            {
                st.pop();
            }
            count=Math.max(count,st.size());
        }return count;
    }
}