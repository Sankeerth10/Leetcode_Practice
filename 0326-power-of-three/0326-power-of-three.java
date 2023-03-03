class Solution {
    public boolean isPowerOfThree(int n) {
        boolean b = false;
        if(n==0){
            b = false;
        }
        else if(n==1){
            b = true;
        }
        else if(n==3){
            b= true;
        }
        else if(n%3==0){
            b = isPowerOfThree(n/3);
        }
        return b;
    }
}