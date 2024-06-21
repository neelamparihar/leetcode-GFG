class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int peak =-1;
        for(int i= n-2;i>=0;i--)
        {
            if(nums[i]<nums[i+1])
            {
                peak = i;
                break;
            }
        }
        if(peak==-1)
        {
            Arrays.sort(nums);
            return;
        }
            for(int i=n-1;i>peak;i--)
            {
                if(nums[i]>nums[peak])
                {
                    int j=nums[i];
                    nums[i]=nums[peak];
                    nums[peak]=j;
                    break;
                }
            }
        
        Arrays.sort(nums,peak+1,n);
        
    }
}