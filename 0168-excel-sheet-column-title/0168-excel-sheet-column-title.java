class Solution {
    public String convertToTitle(int columnNumber) {
        String res = "";
        while(columnNumber> 0){
            int rem = (columnNumber-1)%26;
            char temp1 = (char) (rem + 65);
            res = temp1 + res;
            columnNumber = (columnNumber-1)/ 26;
        }
        return res;
    }
}