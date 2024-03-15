class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int count = 0;
        int n = strs[0].length();
        int len = strs.length;
        for(int i=0;i<n;i++)
        {
            if(strs[0].charAt(i)!=strs[len-1].charAt(i))
            {
                break;
            }
            count++;
        }
        if(count==0)
            return "";
        else
            return strs[0].substring(0,count);
    }
}