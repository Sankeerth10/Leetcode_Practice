class Solution {
    public boolean checkInclusion(String s1, String s2) {
        //Sol1:
        // int left = 0, right = 0;
        // int len1 = s1.length();
        // int len2 = s2.length();
        // char [] charArr1 = s1.toCharArray(); 
        // Arrays.sort(charArr1);
        // while(right < len2) {
        //     while((right - left + 1) == len1) {
        //         String subStr2 = s2.substring(left, right +1);
        //         char [] charArr2 = subStr2.toCharArray();
        //         Arrays.sort(charArr2);
        //         if(Arrays.equals(charArr1, charArr2)) {
        //             return true;
        //         }
        //         left++;
        //     }
        //     right++;
        // }
        // return false;
        
        //Sol2:
        int [] freq1 = new int[26];
        int [] freq2 = new int[26];
        
        if(s1.length() > s2.length()) {
            return false;
        }
        
        for(int i =0; i < s1.length(); i ++) {
            freq1[s1.charAt(i) - 'a']++;
            freq2[s2.charAt(i) - 'a']++;
        }
        
        if(Arrays.equals(freq1, freq2)) {
            return true;
        }
        
        int left =0; 
        int right = s1.length();
        while (right < s2.length()) {
            freq2[s2.charAt(right) - 'a']++;
            freq2[s2.charAt(left) - 'a']--;
            if(Arrays.equals(freq1, freq2)) {
            return true;
            }
            right++;
            left++;
        }
        return false;
    }
}