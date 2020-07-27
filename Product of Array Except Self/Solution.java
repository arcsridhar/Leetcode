class Solution 
{
    public int[] productExceptSelf(int[] nums) 
    {
        int[] product = new int[nums.length];
      
        for(int i = 0,  temp = 1; i < nums.length; i++)
        {
            product[i] = temp;
            temp *= nums[i];
        }
        int result = 1;
        for(int i = nums.length-1; i >= 0; i--)
        {
            product[i] *= result;
            result *= nums[i];
        }
        return product;
    }
}
