class Solution {
    public int[] twoSum(int[] nums, int target) {
        //CREATING HASHMAP
        Map<Integer,Integer> map = new HashMap<>();

        //iterating through the array
        for(int i =0 ; i<nums.length;i++){

            //calculating remainder
            int rem = target-nums[i];
            
            //check if rem is on the hashmap
            if(map.containsKey(rem)) {

                //if the remainder is on hashmap
                return new int[]{map.get(rem),i};
            }
            //if the remainder is bot on hashmap
            map.put(nums[i],i);
        }
        //return empty array if no solution found
        return new int[]{};
    }
}