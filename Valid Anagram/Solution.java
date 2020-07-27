class Solution 
{
    public boolean isAnagram(String s, String t) 
    {
        int[] count = new int[26];
        for(char temp: s.toCharArray())
        {
            count[temp-'a']++;
        }
        for(char temp: t.toCharArray())
        {
            count[temp-'a']--;
        }
        for(int temp: count)
        {
            if(temp!=0) 
                return false;
        }
        return true;
    }
}
