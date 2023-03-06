class Solution {
    public int climbStairs(int n) {
        if(n == 1){
            return 1;
        }
        else if(n == 2){
            return 2;
        }
        else{
        int [] op = new int[n];
        op[0] = 1;
        op[1] = 2;
        for(int i=2; i<op.length;i++){
              op[i] = op[i-1] + op[i-2];  
        }
        return op[n-1];
        }
    }
}