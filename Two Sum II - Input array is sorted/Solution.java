class Solution 
{
    public int[] twoSum(int[] numbers, int target) 
    {
        int startptr = 0;
        int endptr = numbers.length-1;
        while(startptr < endptr)
        {
            int sum = numbers[startptr] + numbers[endptr];
            if(sum > target)
                endptr--;
            else if (sum < target)
                startptr++;
            else
                return new int[]{startptr+1,endptr+1};
        }
        return new int[]{0,0};
    }
}
