class Solution 
{
    public List<List<String>> groupAnagrams(String[] strs) 
    {
        if(strs.length == 0)
            return new ArrayList();
        
        Map<String,List<String>> map = new HashMap<String,List<String>>();
        for(String str: strs)
        {
            char[] words = str.toCharArray();
            Arrays.sort(words);
            String key = String.valueOf(words);
            if(map.containsKey(key))
            {
                List<String> value = map.get(key);
                value.add(str);
                map.put(key, value);
            }
            else
            {
                List<String> value = new ArrayList();
                value.add(str);
                map.put(key, value);
            }
            /*
            if(!map.containsKey(key))
            {
                map.put(key, new ArrayList());
            }
            map.get(key).add(str);
            */
        }
        return new ArrayList(map.values());
    }
}
