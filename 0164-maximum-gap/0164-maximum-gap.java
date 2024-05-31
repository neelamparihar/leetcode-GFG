class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        if(nums.length==1)
            return 0;
        int max =0;
        for(int i=0;i<nums.length-1;i++)
        {
            int sum = nums[i+1]-nums[i];
            max = Math.max(max,sum);
        }
        return max;
    }
}