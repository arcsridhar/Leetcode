class Solution 
{
    public List<List<Integer>> threeSum(int[] nums) 
    {
        /*
        Check if the Integer array is empty and return new array.
        
        Sort the array (Important)
        
        Have three pointer i,j,k where 
        i points to first element and is fixed for one entire iteration
        j points to the second element and k points to the last element
        as long as (j < k) we do the 3 sum calculation
        
        first element + second element + third element = 0
        if greater than 0, decrement the k because the last element has the highest value 
        in sorted array and on decrementing, can get us closer to target.
        if lesser than 0, increment the j pointer as it has one of the least values 
        in sorted array and incrementing can get us closer to target
        
        Equals to 0, add the values to array and display as list.
        
        Why do we use Hashset?
        
        nums = [-1, 0, 1, 2, -1, -4]
        
        A solution set is:
        
            [-1, 0, 1], [-1, -1, 2], [-1, 0, 1] because we have 2 similar values in the array 
            and will display duplicate elements.. Check the condition before converting array 
            to list and display distinct elements

        
        */
        if(nums == null || nums.length == 0)
            return new ArrayList<>();
        
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        
        //Introducing Set DS to avoid duplicates in the array
        Set <Pair<Integer,Integer>> set = new HashSet<>();
        
        for(int i = 0; i < nums.length-2 ; i++)
        {
            int j = i + 1;
            int k = nums.length - 1;
            while(j < k)
            {
                if(nums[i] + nums[j] + nums[k] > 0)
                k--;
            else if(nums[i] + nums[j] + nums[k] < 0)
                j++;
            else
            {
                if(!set.contains(new Pair(nums[i],nums[j])))
                {
                    result.add(Arrays.asList(nums[i], nums[j],nums[k]));
                    set.add(new Pair(nums[i], nums[j]));          
                }   
                j++;
                k--;
            }
            }
        }
        return result;
    }
}
