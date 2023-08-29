class Solution {
    public boolean isAnagram(String s, String t) {
        boolean res = false;
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character, Integer> h = new HashMap<>();
        for(int i =0; i < s.length();i++){
            if(h.containsKey(s.charAt(i))) h.put(s.charAt(i),h.get(s.charAt(i))+1);
            else h.put(s.charAt(i),1);
        }
        for(int j =0; j < t.length();j++){
            char ch = t.charAt(j);
			if(h.containsKey(ch) == false || h.get(ch) == 0) return false;
			else h.put(ch, h.get(ch)-1);
        }
        return true;
    }
}