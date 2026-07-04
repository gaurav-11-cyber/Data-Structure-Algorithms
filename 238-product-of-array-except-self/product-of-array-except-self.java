class Solution {
    public int[] productExceptSelf(int[] nums) {

        //array named result and its length same as nums length
        int[] result = new int[nums.length];

        //set all values of array by default 1
        Arrays.fill(result,1);

        //initializing both post and pre 
        int pre=1,post=1;

        //this iterates frm left to right and also updates the value in the result array and pre
        for(int i=0;i<nums.length;i++){
            //update value inside result array
            result[i]=pre;
            //now prefix will be calculated and when the loop runs once more the value is then put into result array
            pre=nums[i]*pre;
        }

        for(int i =nums.length-1;i>=0;i--){
            result[i]=post*result[i];
            post=post*nums[i];
        }
        return result;
    }
}