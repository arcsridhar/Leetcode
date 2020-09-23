class Solution 
{
    public String toLowerCase(String str) 
    {
        Map<Character,Character> map = new HashMap();
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = "abcdefghijklmnopqrstuvwxyz";
        for(int i = 0; i < 26; i++)
        {
            map.put(upper.charAt(i), lower.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        for(char i: str.toCharArray())
        {
            sb.append(map.containsKey(i) ? map.get(i) : i);
        }
        return sb.toString();
    }
}
