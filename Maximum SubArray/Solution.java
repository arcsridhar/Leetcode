class Solution 
{
    public int maxSubArray(int[] nums) 
    {
        //Initially set the maxsum to the first element
        int max_sum = nums[0];
        int current_sum = max_sum;
        //Iterate from the second element
        for(int i = 1; i < nums.length; i++)
        {
            current_sum = Math.max(nums[i] + current_sum, nums[i]);
            max_sum = Math.max(current_sum, max_sum);
        }
        return max_sum;
    }
}
