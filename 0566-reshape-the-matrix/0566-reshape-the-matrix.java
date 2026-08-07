class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] res=new int[r][c];
        int row=mat.length;
        int col=mat[0].length;
        int i1=0,i2=0;
        if(row*col==r*c){
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(i1<r&&i2<c)
                {
                    res[i1][i2]=mat[i][j];
                    i2++;
                }
                if(i2==c)
                {
                    i2=0;
                    i1++;
                }
            }
        }}
        else
        {
            return mat;
        }return res;
    }
}