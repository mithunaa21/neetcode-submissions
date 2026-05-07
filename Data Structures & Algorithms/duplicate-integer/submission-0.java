class Solution {
    public boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            if(i+1<n && nums[i]==nums[i+1])
            return true;
        }
        return false;
    }
}