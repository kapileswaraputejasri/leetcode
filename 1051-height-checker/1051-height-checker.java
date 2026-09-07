class Solution {
    public int heightChecker(int[] heights) {
    int[] height=heights.clone();
    for(int i=0;i<height.length-1;i++)
    {
        for(int j=0;j<height.length-i-1;j++)
        {
            if(height[j]>height[j+1])
            {
                int temp=height[j];
                height[j]=height[j+1];
                height[j+1]=temp;
            }
        }
    }
    int count=0;
    for(int i=0;i<height.length;i++)
    {
        if(heights[i]!=height[i])
        {
            count++;
        }
    }
    return count;
    }
}