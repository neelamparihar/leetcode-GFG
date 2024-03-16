class Solution {
    public int findMaxLength(int[] nums) {
       int max =0;
        int sum=0;
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        for(int i=0;i<n;i++)
        {
            if(nums[i]==0)
            {
                nums[i]=-1;
            }
        }
        for(int i=0;i<n;i++)
        {
            sum+=nums[i];
            if(!map.containsKey(sum))
            {
                map.put(sum,i);
            }else{
                int idx = map.get(sum);
                max = Math.max(max,i-idx);
                
            }
        }
        return max;
    }
}