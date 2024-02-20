class Solution {
    public List<String> letterCombinations(String digits) {
        HashMap<Character, String> map = new HashMap<>()
{{
     put('2', "abc");
     put('3', "def");
     put('4', "ghi");
     put('5', "jkl");
     put('6', "mno");
     put('7', "pqrs");
     put('8', "tuv");
     put('9', "wxyz");
}};
        List<String> res = new ArrayList<>();
        if(digits == null || digits.length() == 0) 
            return res;

        
        letterCombinations(0, digits,"",res, map);
        return res;
    }
    
    public void letterCombinations(int index, String digits, String temp, List<String> res, HashMap<Character, String> map) {
        //Base case
        if(index == digits.length()) {
            res.add(temp);
            return;
        }
        String letters = map.get(digits.charAt(index));
        for(int i =0; i < letters.length(); i ++) {
            letterCombinations(index + 1, digits, temp + letters.charAt(i), res, map);
        }
    }
}