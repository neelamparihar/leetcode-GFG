class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int[][] res = new int[rowSum.length][colSum.length];
        int[] actualRowSum = new int[rowSum.length];
        int[] actualColSum = new int[colSum.length];

        for(int i = 0 ; i < rowSum.length; i++) {
            for(int j = 0 ; j < colSum.length; j++) {
                
                int remainingRow = rowSum[i] - actualRowSum[i];
                int remainingCol = colSum[j] - actualColSum[j];
                int val = Math.min(remainingRow, remainingCol);
                res[i][j] = val;
                actualRowSum[i] += val;
                actualColSum[j] += val;
            }
        }
        return res;
    }
}