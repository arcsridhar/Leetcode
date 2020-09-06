class Solution 
{
    static final String PUSH = "Push";
    static final String POP = "Pop";
    
    public List<String> buildArray(int[] target, int n) 
    {
        List<String> result = new ArrayList();
        int expectedValue = 1;
        for(int i = 0; i < target.length; i++)
        {
            while(target[i] > expectedValue++)
            {
                result.add(PUSH);
                result.add(POP);
            }
            result.add(PUSH);
        }
        return result;
    }
}
