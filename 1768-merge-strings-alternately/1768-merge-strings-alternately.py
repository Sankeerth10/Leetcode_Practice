class Solution(object):
    def mergeAlternately(self, word1, word2):
        output = ""
        len1 = len(word1)
        len2 = len(word2)
        i =0
        while i< len1 or i< len2:
            if i< len1:
                output += word1[i]
            if i< len2:
                output += word2[i]   
            i +=1
        return output