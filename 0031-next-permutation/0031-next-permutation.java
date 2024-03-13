class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        // store the breaking point
        int idx = -1;

        for(int i = n-2 ; i>=0 ; i--) {
            if(nums[i] < nums[i+1]) {
                idx = i;
                break;
            }
        }
        
        // base case - no breakpoint found
        if(idx == -1) {
            Arrays.sort(nums, 0, n);
            return;
        }


        // finding the greater but closest num
        for(int i=n-1 ; i>idx ; i--) {
            if(nums[i] > nums[idx]) {
                int temp = nums[i];
                nums[i] = nums[idx];
                nums[idx] = temp;
                break;
            }
        }
        // Reversing the remaining array.
        Arrays.sort(nums, idx+1, n);
    }
}