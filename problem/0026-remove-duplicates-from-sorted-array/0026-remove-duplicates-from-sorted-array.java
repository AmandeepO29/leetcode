class Solution {
    public int removeDuplicates(int[] nums) {
        int prev=nums[0];
        int k=1;
        for(int i=1;i<nums.length;i++){
            if(prev!=nums[i]){
                nums[k]=nums[i];
                prev=nums[i];
                k++;
            }
        }
        return k;
    }
}