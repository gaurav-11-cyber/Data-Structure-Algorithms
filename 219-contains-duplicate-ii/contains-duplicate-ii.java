class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        //Creating a hashset
        Set <Integer> set = new HashSet<>();

        //iterate through the array
        for (int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]); // add the numbers to the hashset if it is not already present

            //removing the size greater the k no. of elements
            if(set.size()>k){
            set.remove(nums[i - k]);
            }
        }
        return false;
    }
}