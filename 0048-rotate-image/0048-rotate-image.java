class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
       
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                stack.push(matrix[i][j]);
            }
        }
        
        for(int i=0;i<n;i++)
        {
            for(int j=n-1;j>=0;j--)
            {
                matrix[j][i]=stack.pop();
            }
        }
       
    }
}