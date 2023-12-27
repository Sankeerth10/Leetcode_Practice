class Solution {
    public int titleToNumber(String columnTitle) {
        char[] chr = columnTitle.toCharArray();
        int res = 0;
        int count = 0;
        for(int i = chr.length - 1; i >= 0; i-- ){
            int temp = (int) chr[i] - 65 + 1; 
            res = res + (int)Math.pow(26, count)*temp;
            count++;
            System.out.println(res + " ");
        }
        return res;
    }
}