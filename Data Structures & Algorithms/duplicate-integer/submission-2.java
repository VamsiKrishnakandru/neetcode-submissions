class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean isDuplicate = false;
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]!=-1)
            {
            for(int j=i+1; j<nums.length; j++)
            if(nums[i]==nums[j])
            {
                nums[j]=-1;
                isDuplicate = true;
                break;
            }
            }
        }
        return isDuplicate;
    }
}