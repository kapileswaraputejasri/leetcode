class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double res=0;
        int[] merge=new int[nums1.length+nums2.length];
        int i=0;
        int j=0;int k=0;
        while(i<nums1.length && j<nums2.length)
        {
            if(nums1[i]<nums2[j])
            {
                merge[k]=nums1[i];
                i++;
                
            }
            else
            {
                merge[k]=nums2[j];
                j++;
                
            }k++;
        } 
        while(i<nums1.length)
        {
            merge[k]=nums1[i];
            k++;i++;
        }
        while(j<nums2.length)
        {
            merge[k]=nums2[j];
            k++;j++;
        }

        int length=merge.length;
        int mid=length/2;
        if(length%2==1)
        {
           return merge[mid];
        }else
        {
            return ((double)merge[mid-1]+merge[mid])/2;
        }
    }
}