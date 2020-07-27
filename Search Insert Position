class Solution {
    public int searchInsert(int[] nums, int target) {
        
        int first,last;
        first = 0;
        last = nums.length-1;
        while(first <= last)
        {
            int mid = (first+last)/2;
            if(target < nums[mid])
                last -= 1;
            else if(target > nums[mid])
                first += 1;
            else if(target == nums[mid])
                return mid;
            
        }
        return first;
    }
}
