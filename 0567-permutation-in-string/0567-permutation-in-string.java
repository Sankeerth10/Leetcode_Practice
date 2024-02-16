class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int left = 0, right = 0;
        int len1 = s1.length();
        int len2 = s2.length();
        char [] charArr1 = s1.toCharArray(); 
        Arrays.sort(charArr1);
        while(right < len2) {
            while((right - left + 1) == len1) {
                String subStr2 = s2.substring(left, right +1);
                char [] charArr2 = subStr2.toCharArray();
                Arrays.sort(charArr2);
                if(Arrays.equals(charArr1, charArr2)) {
                    return true;
                }
                left++;
            }
            right++;
        }
        return false;
    }
}