class Solution {
    public int lengthOfLongestSubstring(String s) {
        int res = 0;
        int left = 0, right = 0;
        HashSet<Character> charSet = new HashSet<>();
        for(int i =0; i < s.length(); i++){
            if(!charSet.contains(s.charAt(i))){
                charSet.add(s.charAt(i));
                res = Integer.max(charSet.size(), res);
            }
            else{
                while(charSet.contains(s.charAt(i))){
                    charSet.remove(s.charAt(left));
                    left++;
                }
                charSet.add(s.charAt(i));
            }  
        }
        return res;
    }
}