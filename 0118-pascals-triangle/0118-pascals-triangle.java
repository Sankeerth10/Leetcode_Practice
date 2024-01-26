class Solution {
    public List<List<Integer>> generate(int numRows) {
        ArrayList<List<Integer>> res = new ArrayList <>();
        for(int i =0; i < numRows; i ++) {
            List<Integer>li=new ArrayList<>();
            
            for(int j=0;j<=i;j++){
                if(j == 0 || j == i){
                    li.add(1);
                }
                else{
                    List<Integer> prev_list = res.get(i-1);
                    li.add(prev_list.get(j-1) + prev_list.get(j));
                }
            }
            res.add(li);
        }
        return res;
    }
}