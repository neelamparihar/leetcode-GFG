class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int i=n-1;
        int j=0;
        while(i>=0 && j<m)
        {
            if(nums1[i]>=nums2[j])
            {
                int temp = nums1[i];
                nums1[i] = nums2[j];
                nums2[j] = temp;
                i--;
                j++;
            }
            else{
                i--;
                j++;
            }
        }
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> list = new ArrayList<>();
        for(int k=0;k<n;k++)
        {
            list.add(nums1[k]);
        }
        for(int k=0;k<m;k++)
        {
            list.add(nums2[k]);
        }
        int x = (n+m)/2;
        if((n+m)%2==0)
        {
           return ((double)list.get(x)+(double)list.get(x-1))/2; 
        }
        return (double)list.get(x);
    }
}