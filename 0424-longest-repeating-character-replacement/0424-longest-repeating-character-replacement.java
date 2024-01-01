class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int[] count = new int[26];//used to store freq of characters
        int max = 0;
        int most_freq = 0; //count of character with highest freq
        for(int right = 0 ;right<s.length();right++){
            char ch = s.charAt(right);
            count[ch-'A']++;
            most_freq = Math.max(most_freq,count[ch-'A']);
            int total = right-left+1; //total elements in window
            if( total - most_freq <= k){
                max = Math.max(max,total);
                
            }else{
                count[s.charAt(left)-'A']--;
                left++;;
            }
        }
        return max;
    }
}