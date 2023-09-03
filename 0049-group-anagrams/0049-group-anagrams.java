class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> res = new HashMap<>();
        for(String s: strs){
            char []charArr = s.toCharArray();
            Arrays.sort(charArr); 
            String a = String.valueOf(charArr);
            if(!res.containsKey(a)){
                ArrayList<String> arr = new ArrayList<String>();
                arr.add(s);
                res.put(a, arr);
            }
            else{
                res.get(a).add(s);
            }  
        }
        return new ArrayList(res.values());
    }
}