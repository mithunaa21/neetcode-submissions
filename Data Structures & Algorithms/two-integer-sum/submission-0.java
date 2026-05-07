class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans=new int[2];
        int n=nums.length;
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            int diff=target-nums[i];
            if(list.contains(diff))
            {
                ans[0]=list.indexOf(diff);
                ans[1]=i;
                break;
            }
             list.add(nums[i]);
        }
return ans; 
    }
}
