class Solution {
    public int compress(char[] chars) {
        int read=0;
        int write=0;
        int n=chars.length;
        while(read<n)
        {
            char current=chars[read];
            int count=0;
            while(read<n && chars[read]==current)
            {
                read++;
                count++;
            }
            chars[write]=current;
            write++;

            if(count>1){
            String str=String.valueOf(count);
            for(char c:str.toCharArray())
            {
                chars[write]=c;
                write++;
            }
            }
        }return write;
    }
}