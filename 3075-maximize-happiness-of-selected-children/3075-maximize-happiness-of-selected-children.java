class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        
        Arrays.sort(happiness);
        long ans = 0;
        int n = happiness.length;
        int count = 0;

        // for (int i = n - 1; i >= n - k; --i) {
        //     happiness[i] = Math.max(happiness[i] - j++, 0);
        //     res += happiness[i];
        // }
        
            
            for(int i=n-1;i>=n-k;i--)
            {
                
                happiness[i] = Math.max(happiness[i] - count, 0);
                count++;
                ans+=happiness[i];
            }
            
        

        return ans;
    }
}