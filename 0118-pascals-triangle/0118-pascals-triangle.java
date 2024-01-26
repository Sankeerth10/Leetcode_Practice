class Solution {
    public List<List<Integer>> generate(int numRows) {
        ArrayList<List<Integer>> res = new ArrayList <>();
        for(int i =0; i < numRows; i ++) {
            List<Integer>li=new ArrayList<>();
            
            for(int j=0;j<i+1;j++){
                if(j == 0 || j == i){
                    li.add(1);
                }
                else{
                    li.add(res.get(i-1).get(j-1) + res.get(i-1).get(j));
                }
            }
            res.add(li);
        }
        return res;
    }
}