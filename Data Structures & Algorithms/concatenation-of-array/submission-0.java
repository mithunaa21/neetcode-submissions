class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int a=n;
        int[] ans=new int[n+n];
        for(int i=0;i<n;i++)
        {
            ans[i]=nums[i];
        }
        for(int i=0;i<n;i++)
        {
            ans[a++]=nums[i];
        }
        return ans;
    }
}