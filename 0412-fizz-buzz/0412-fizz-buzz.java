class Solution {
    public List<String> fizzBuzz(int n) {
        ArrayList<String> res = new ArrayList<>();
        for(int i =0; i < n;i++){
            int ip = i+1;
            res.add(ip % 15 ==0 ? "FizzBuzz" :
            ip% 3 ==0 ? "Fizz":
            ip% 5==0 ? "Buzz":
            String.valueOf(ip));
        }
        return res;
    }
}