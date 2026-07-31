class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
       int count=0;
       int avg=0;int i=0;
       while(i<=arr.length-k)
       { int sum=0;
        for(int j=i;j<i+k;j++)
        {
            sum+=arr[j];
        } 
        if(sum>=threshold*k)
        {
            count++;
        }
       i++;}
       return count;
    }
}