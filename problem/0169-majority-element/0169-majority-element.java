class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int ele=nums[0];
        for(int i=0;i<nums.length;i++){
            if(count==0){
                ele=nums[i];
                count++;
            }
            else{
                if(nums[i]==ele){
                    count++;
                }
                else
                    count--;
            }
        }
        return ele;
        // HashMap<Integer,Integer> map=new HashMap<>();
        // for(int i=0;i<nums.length;i++){
        //     if(!map.containsKey(nums[i])){
        //         map.put(nums[i],1);
        //     }
        //     else{
        //         map.put(nums[i],map.get(nums[i])+1);
        //     }
        // }
        // for(Map.Entry<Integer,Integer> entry : map.entrySet()){
        //     if(entry.getValue()>nums.length/2){
        //         return entry.getKey();
        //     }
        // }
        // return -1;
    }
}