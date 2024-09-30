class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer,Integer> map= new HashMap<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }else{
                map.put(nums[i],map.get(nums[i])+1);
            }
        }
        int x=-1;
        for(int i=0;i<n;i++){
            if(map.get(nums[i])>1){
                x = nums[i];
                break;
            }
        }
        return x;
    }
}