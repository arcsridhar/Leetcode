class Solution 
{
    public int fib(int N) 
    {
        int first = 0, second = 1;
        for(int i = 0; i < N; i++)
        {
            first = first + second;
            second = first - second;
        }
        return first;
    }
}
