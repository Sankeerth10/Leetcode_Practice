class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> h = new HashMap<>();
        ArrayList <Integer> al = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(!h.containsKey(nums[i])){
                h.put(nums[i],1);
            }
            else{
                int val = h.get(nums[i]);
                h.put(nums[i],val+1);
            }
        }
        List<Integer> res = h.entrySet().
                            stream().
                            sorted((a,b)-> b.getValue().compareTo(a.getValue())).
                            limit(k).
                            map(i->i.getKey()).
                            collect(Collectors.toList());
        int [] op = new int[res.size()];
        for(int i=0; i< res.size();i++){
            op[i] = res.get(i);
        }
        return op;
    }
}