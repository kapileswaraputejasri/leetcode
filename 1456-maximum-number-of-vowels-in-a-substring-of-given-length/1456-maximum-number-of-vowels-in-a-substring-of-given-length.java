class Solution {
    public int maxVowels(String s, int k) {
        char[] arr=s.toCharArray();
        int i=0;int count=0;int res=0;
        for(int j=0;j<arr.length;j++)
        {
            if("aeiou".indexOf(arr[j])!=-1)
            {
                count++;
            }
            while(j-i+1>k)
            {
                if("aeiou".indexOf(arr[i])!=-1){
                count--;
                }
                i++;
            }
            res=Math.max(res,count);
        }return res;
    }
}