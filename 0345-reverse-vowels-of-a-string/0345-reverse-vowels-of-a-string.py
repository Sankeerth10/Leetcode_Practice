class Solution:
    def reverseVowels(self, s: str) -> str:
        j = 0
        vowel = [0] * len(s)
        string = list(s)
        for i in range(len(string)):
            if (string[i] == 'a' or string[i] == 'A' or string[i] == 'e' or string[i] == 'E' or string[i] == 'i' or string[i] == 'I' or string[i] == 'o' or string[i] == 'O' or string[i] == 'u' or string[i] == 'U'):
                vowel[j] = string[i]
                j+= 1
        for i in range(len(string)):
            if (string[i] == 'a' or string[i] == 'A' or string[i] == 'e' or string[i] == 'E' or string[i] == 'i' or string[i] == 'I' or string[i] == 'o' or string[i] == 'O' or string[i] == 'u' or string[i] == 'U'):
                j -= 1
                string[i] = vowel[j]
 
        return ''.join(string)