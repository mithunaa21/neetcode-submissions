class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        ArrayList<Integer>list=new ArrayList<>();
        int l=0;
        for(int i=0;i<nums.length-k+1;i++)
        {
            int maxint=Integer.MIN_VALUE;
            for(int j=i;j<i+k;j++)
            {
                 maxint=Math.max(maxint,nums[j]);

            }
            list.add(maxint);
        }
        int[] res=new int[list.size()];
        for(int i=0;i<list.size();i++)
        {
            res[i]=list.get(i);
        }
        return res;
    }
}
