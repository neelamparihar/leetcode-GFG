class Solution {
    public int countSeniors(String[] details) {
        int n= details.length;
        int count=0;
        for(int i=0;i<n;i++)
        {
            char a = details[i].charAt(11);
            char b = details[i].charAt(12);
            String ch = String.valueOf(a) + String.valueOf(b);
            int res = Integer.parseInt(ch);
            if(res>60)
            {
                count++;
            }
            
        }
        return count;
    }
}