class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] freq=new int[256];
        int maxi=0,l=0;
         for(int r=0;r<s.length();r++)
        {
            freq[s.charAt(r)]++;
            if(freq[s.charAt(r)]<=1)
            maxi=Math.max(maxi,r-l+1);
            else
            {
                while(freq[s.charAt(r)]>1)
                {
                freq[s.charAt(l)]--;
                l++;
                }
            }
        }
        return maxi;
        
    }
}
