class Solution {
    public boolean isPowerOfTwo(int n) {
        boolean b = false;
        if(n==0){
            b= false;
        }
        else if(n ==1){
            b = true;
        }
        else if(n==2){
            b = true;
        }
        else if(n%2 == 0){
                b = isPowerOfTwo(n/2);
            }
        return b;
    }
}