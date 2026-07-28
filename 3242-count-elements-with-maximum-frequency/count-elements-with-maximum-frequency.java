class Solution {
    public int maxFrequencyElements(int[] nums) {
        int max=0;
        int maxfreq=0;
        for(int i=0;i<nums.length;i++)
        {
            if(max<nums[i])
            {
                max=nums[i];
            }
        }
        int[] freq=new int[max+1];
        for(int i=0;i<nums.length;i++)
        {
            freq[nums[i]]++;
        }int count=0;
        for(int i=0;i<freq.length;i++)
        {
            maxfreq=Math.max(maxfreq,freq[i]);
        }
        for(int i=0;i<freq.length;i++)
        {
            if(freq[i]==maxfreq)
            {
                count+=freq[i];
            }
        }return count;
    }
}