class Solution {
    public void setZeroes(int[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;
        boolean frow=false;
        boolean fcol=false;

        for(int c=0;c<col;c++)
        {
            if(matrix[0][c]==0)
            {
                frow=true;
                break;
            }
        }

        for(int r=0;r<row;r++)
        {
            if(matrix[r][0]==0)
            {
                fcol=true;
                break;
            }
        }

        for(int r=1;r<row;r++)
        {
            for(int c=1;c<col;c++)
            {
                if(matrix[r][c]==0)
                {
                    matrix[r][0]=0;
                    matrix[0][c]=0;
                }
            }
        }

        for(int r=1;r<row;r++)
        {
            if(matrix[r][0]==0)
            {
                for(int c=1;c<col;c++)
                {
                    matrix[r][c]=0;
                }
            }
        }
         for (int c = 1; c < col; c++) {
            if (matrix[0][c] == 0) {
                for (int r = 1; r < row; r++) {
                    matrix[r][c] = 0;
                }
            }
        }

        if (frow) {
            for (int c = 0; c < col; c++) {
                matrix[0][c] = 0;
            }
        }

        
        if (fcol) {
            for (int r = 0; r < row; r++) {
                matrix[r][0] = 0;
            }
        }        
    }
}