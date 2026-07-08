class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int l=nums.length;
        int target=1;
        for(int i=0;i<l;i++){
            if(nums[i]==target){
                target++;
                
            }
            
        }
        return target;

        
    }
}