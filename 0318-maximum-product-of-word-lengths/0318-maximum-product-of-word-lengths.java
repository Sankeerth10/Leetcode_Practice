class Solution {
    public int maxProduct(String[] words) {
        int maxProduct = 0;
        int matrix[][] = new int[words.length][26];
        for(int i =0; i < words.length;i++){
            for(int j =0; j < words[i].length();j++){
                  if(matrix[i][words[i].charAt(j)-'a']==0){
                    matrix[i][words[i].charAt(j)-'a']++;
                }
            }
        }
        for(int i=0;i<words.length;i++){
            for(int j=i+1;j<words.length;j++){
                if(lettersNotCommon(i,j,matrix)){
                    maxProduct = Math.max(maxProduct,words[i].length()*words[j].length());
                }
            }
        }
        return maxProduct;
    }
    private boolean lettersNotCommon(int r1 , int r2, int [][]map){
        
        for(int j=0;j<26;j++){
            if(map[r1][j]== 1 && map[r2][j]==1){
                return false;
            }
        }
        return true;
    }
}