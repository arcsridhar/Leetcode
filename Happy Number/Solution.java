class Solution {
    public boolean isHappy(int n) 
    {
        int slow = n;
        int fast = giveResult(slow);
        while(slow != fast && fast != 1)
        {
            slow = giveResult(slow);
            fast = giveResult(giveResult(fast));
        }
        return fast == 1; 
    }
    
   public int giveResult (int n)
   {
       int result = 0;
       while(n > 0)
       {
            result = result + (n % 10) * (n % 10); 
            n = n / 10;
       }
       return result;
    }
}
