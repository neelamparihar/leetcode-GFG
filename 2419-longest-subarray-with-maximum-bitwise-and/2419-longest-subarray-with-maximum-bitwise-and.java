class Solution {
    public int longestSubarray(int[] nums) {
     int max = nums[0];
     for(int i=1;i<nums.length;i++)
     {
        if(nums[i]>max)
        {
            max=nums[i];
        }
     }
     int res=0;
     int count=0;
     for(int i=0;i<nums.length;i++)
     {
         if(nums[i]!=max)
         {
            count=0;
         }else{
            count++;
            res= Math.max(res,count);
         }
     }
     return res;

    }
}