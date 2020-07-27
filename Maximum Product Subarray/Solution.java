class Solution {
    public int maxProduct(int[] nums) 
    {
        int currentProduct = 1;
        int maxProduct = Integer.MIN_VALUE;
        for (int i = 0;i < nums.length; i++)
        {
            currentProduct *= nums[i];
            maxProduct = Math.max(currentProduct, maxProduct);
            if(currentProduct == 0)
                currentProduct = 1;
        }
        currentProduct = 1;
        for (int i = nums.length - 1; i >= 0; i--)
        {
            currentProduct *= nums[i];
            maxProduct = Math.max(currentProduct, maxProduct);
            if (currentProduct == 0) 
                currentProduct = 1;
        }
       return maxProduct; 
    }
}
