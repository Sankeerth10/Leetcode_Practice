class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;
        boolean res = false;
        while(i < s.length() && j < t.length()){
            if(s.charAt(i) == t.charAt(j)) {
                i++;
                j++;
            }
            else {
                j++;
            }
        }
        
        if(i == s.length()){
              res = true; 
        }
        
        return res;
    }
}