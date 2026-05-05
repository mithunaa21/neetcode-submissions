class Solution {
    public boolean isAnagram(String s, String t) {
        char[] as=s.toCharArray();
        char[] at=t.toCharArray();
        Arrays.sort(as);
        Arrays.sort(at);
        if(as.length!=at.length)
        return false;
        for(int i=0;i<as.length;i++)
        {
            if(as[i]!=at[i])
            return false;
        }
return true;
    }
}
