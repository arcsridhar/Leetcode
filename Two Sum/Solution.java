class Solution 
{
    public int[] twoSum(int[] nums, int target) 
    {
        //using HashMap to store key value pairs
        Map<Integer,Integer> map = new HashMap<>();
        
        //Iterate through nums array
        for(int i = 0; i < nums.length ; i++)
        {
            //Formula to find the elements constituting the target
            int complement = target - nums[i];
            
            //If the key is mapped to HashMap, returns true 
            if(map.containsKey(complement))
            {
                //Return the value(index) to the specified key and the index of i
                return new int[] {map.get(complement), i};
            }
            //Else it keeps on adding next element if the condition fails
            map.put(nums[i],i);
        }
        throw new IllegalArgumentException("No new Match");
    }
}
