class Solution {
    public String reverseVowels(String s) {
        int start=0;int end=s.length()-1;
        char[] arr=s.toCharArray();
        while(start<end)
        {
            while(start <end && "aeiouAIEOU".indexOf(arr[start])==-1)
            {
                start++;
            }
             while(start <end && "aeiouAIEOU".indexOf(arr[end])==-1)
            {
                end--;
            }
            
                char temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
            start++;
            end--;
        }return new String(arr);
    }
}