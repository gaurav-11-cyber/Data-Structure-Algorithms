class Solution {
    public boolean containsDuplicate(int[] nums) {

        //creating hashset to store the numbers
        HashSet<Integer> seenNumbers = new HashSet<>();

        //iterating through the each element in array
        for (int num : nums){
            //check if the element is present in the hashset
            if (seenNumbers.contains(num)){
                return true; // duplicate found
            } 
            //adding element to the hashset that doesnt have the duplicate
            seenNumbers.add(num);
        }
        return false; //this returns false when there is no same element appearing atleast twice 
    }
}