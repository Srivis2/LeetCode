class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int check=0;
        for(int i=0; i<nums.length; i++){
            if(check==nums[i]){
                check++;
            }else{
                return check;
            }
        }
        return check;
    }
}