class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }else{
                map.put(nums[i],map.get(nums[i])+1);
            }
        }
        int n = nums.length;
        for(int i=0;i<nums.length;i++)
        {
            if(map.get(nums[i])>n/3 && ! list.contains(nums[i]))
            {
                list.add(nums[i]);
            }
        }
        return list;
    }
}