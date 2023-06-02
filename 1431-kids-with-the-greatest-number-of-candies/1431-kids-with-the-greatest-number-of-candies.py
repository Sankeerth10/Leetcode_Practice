class Solution:
    def kidsWithCandies(self, candies: List[int], extraCandies: int) -> List[bool]:
        len1 = len(candies);
        outputList = list(range(len1))
        for i in outputList:
            outputList[i] = False
        max_val = max(candies)
        j =0
        for j in range(len(candies)):
            if(candies[j]+ extraCandies >= max_val):
                outputList[j] = True
        return outputList
            
            