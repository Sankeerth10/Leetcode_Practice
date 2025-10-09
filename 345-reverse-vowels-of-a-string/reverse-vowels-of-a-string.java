class Solution {
    public String reverseVowels(String s) {
       Set<Character> vowels = Set.of(
            'a', 'e', 'i', 'o', 'u',
            'A', 'E', 'I', 'O', 'U'
        );
    char[] chars = s.toCharArray();
    int left = 0, right = s.length() - 1;

    while (left < right) {
      char leftChar = chars[left];
      char rightChar = chars[right];

      if (!vowels.contains(leftChar)) {
        left++;
      } 
      else if (!vowels.contains(rightChar)) {
        right--;
      } 
      else {
        char temp = chars[left];
        chars[left] = chars[right];
        chars[right] = temp;
        left++;
        right--;
      }
    }

    return new String(chars);
    }
}