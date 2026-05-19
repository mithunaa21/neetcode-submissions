class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>>list=new ArrayList<>();
        HashMap<String,List<String>>map=new HashMap<>();
        for(String s:strs)
        {
            char[] word=s.toCharArray();
            Arrays.sort(word);
            String key=new String(word);
            if(!map.containsKey(key))
            {
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(s);
        }
        for(List<String>grp:map.values())
        {
            list.add(grp);

        }
        return list;
    }
}
