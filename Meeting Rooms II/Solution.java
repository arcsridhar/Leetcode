class Solution 
{
    public int minMeetingRooms(int[][] intervals) 
    {
        if(intervals.length <= 1)
            return intervals.length;
        
        int[] start = new int[intervals.length];
        int[] end = new int[intervals.length];
        
        for(int i = 0; i < intervals.length; i++)
        {
            start[i] = intervals[i][0];
            end[i] = intervals[i][1];
        }
        int result = 0, endptr = 0;
        Arrays.sort(start);
        Arrays.sort(end);
        
        for(int i = 0; i < intervals.length; i++)
        {
            if(start[i] < end[endptr])
            {
                result++;
            }
            else
                endptr++;
        }
        return result;
    }
}
