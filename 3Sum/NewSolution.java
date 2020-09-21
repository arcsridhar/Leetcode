class NewSolution 
{
    public List<List<Integer>> threeSum(int[] nums) 
    {
        List<List<Integer>> result = new ArrayList();
        if(nums.length == 0)
            return result;
        
        Arrays.sort(nums);
        for(int i = 0; i < nums.length-2; i++)
        {
            if(i == 0 || nums[i] != nums[i-1])
            {
                int start = i+1;
                int end = nums.length-1;
                int sum = 0 - nums[i];
                while(start < end)
                {
                    if(nums[start] + nums[end] == sum)
                    {
                        result.add(Arrays.asList(nums[i], nums[start], nums[end]));
                        while(start < end && nums[start] == nums[start+1])
                            start++;
                        while(start < end && nums[start] == nums[end-1])
                            end--;
                        start++;
                        end--;
                    }
                    else if(nums[start] + nums[end] < sum)
                        start++;
                    else 
                        end--;
                }   
            }
        }
        return result;
    }
}
