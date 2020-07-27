class Solution 
{
    public int missingNumber(int[] nums) 
    {
        int sum = 0;
        int length = nums.length;
        int missingNumber = length * (length+1)/2;
        for(int i:nums)
            sum += i;
        
        return missingNumber - sum;
    }
}
