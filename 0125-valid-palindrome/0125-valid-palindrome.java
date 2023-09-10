class Solution {
    public boolean isPalindrome(String s) {
        boolean res = false;
        String a = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        StringBuilder sb = new StringBuilder(a);
        System.out.println(a);
        String b = sb.reverse().toString();
        System.out.println(b);
        if(b.equals(a))
            res = true;
        else
            res = false;
        return res;
    }
}