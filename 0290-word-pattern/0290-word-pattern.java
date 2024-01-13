class Solution {
    public boolean wordPattern(String pattern, String s) {
        int i = 0;
        String [] arr = s.split(" ");
        if(pattern.length() != arr.length){
            return false;
        }
        HashMap<Character, String> hm = new HashMap<>();
        while (i < pattern.length()) {
            if(hm.containsKey(pattern.charAt(i))) {
                String val = hm.get(pattern.charAt(i));
                if(!arr[i].equals(val)){
                    return false;
                }
            }
            else {
                if(!hm.containsValue(arr[i])){
                    hm.put(pattern.charAt(i), arr[i]);    
                }
                else {
                    return false;
                }
            }
            i++;
        }
        return true;
    }
}