class Solution {
    public String countAndSay(int n) {
        String target = "1";
        if(n==1)
            return target;
        
        for(int j=2;j<=n;j++)
        {
            int curr = 1;
            String s ="";
            for(int i=1;i<target.length();i++)
            {
                if(target.charAt(i)!=target.charAt(i-1))
                {
                   s+=Integer.toString(curr);
                   s+=target.charAt(i-1);
                   curr=1;
                }else{
                    curr++;
                }
            }
            if(curr>0)
            {
                 s+=Integer.toString(curr);
                 s+=target.charAt(target.length()-1);
            }
            target = s;
        }
        return target;
    }
}