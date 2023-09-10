class Solution {
    public boolean isPalindrome(String s) {
        // boolean res = false;
        // String a = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        // StringBuilder sb = new StringBuilder(a);
        // System.out.println(a);
        // String b = sb.reverse().toString();
        // System.out.println(b);
        // if(b.equals(a))
        //     res = true;
        // else
        //     res = false;
        // return res;
        
        int left = 0;
        int right = s.length()-1;
        while(left<right){
            char charLeft = s.charAt(left);
            char charRight = s.charAt(right);
            if (!Character.isLetterOrDigit(charLeft)) {
        		left++;
        	} else if(!Character.isLetterOrDigit(charRight)) {
        		right--;
        	} else {
        		if (Character.toLowerCase(charLeft) != Character.toLowerCase(charRight)) {
        			return false;
        		}
        		left++;
        		right--;
        	}
        }
        return true;
    }
}