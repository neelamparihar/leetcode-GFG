class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int rightmostpeak = -1;

        for(int i = n-2 ; i>=0 ; i--) {
            if(nums[i] < nums[i+1]) {
                rightmostpeak = i;
                break;
            }
        }
        
        if(rightmostpeak == -1) {
            Arrays.sort(nums);
            return;
        }

        for(int i=n-1 ; i>rightmostpeak ; i--) {
            if(nums[i] > nums[rightmostpeak]) {
                int temp = nums[i];
                nums[i] = nums[rightmostpeak];
                nums[rightmostpeak] = temp;
                break;
            }
        }
        Arrays.sort(nums, rightmostpeak+1, n);
    }
}