class Solution {
    public boolean isPalindrome(int x) 
    {
        int result = 0;
        
        if(x < 0 || (x % 10 == 0 && x != 0))
        {
            return false;
        }
            
        
        while(x > result)
        {
            //remainder = x % 10;
            result = result * 10 + (x % 10);
            x /= 10;
        }
        return (x == result ||  x == result/10);
    }
}
