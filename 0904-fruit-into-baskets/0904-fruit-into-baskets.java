public class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxFruits = 0, left = 0;
        
        for (int right = 0; right < fruits.length; right++) {
            map.put(fruits[right], right);
            while (map.size() > 2) {
                if (map.get(fruits[left]) == left) {
                    map.remove(fruits[left]);
                }
                left++;
            }
            
            maxFruits = Math.max(maxFruits, right - left + 1);
        }
        
        return maxFruits;
    }
}
