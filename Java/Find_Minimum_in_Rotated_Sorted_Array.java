class Find_Minimum_in_Rotated_Sorted_Array {
    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int medium = (low + high) / 2;
        
        while(low + 1 < high){
            if(nums[low] < nums[high]){
                return nums[low];
            }else if(nums[medium] < nums[high]){
                high = medium;
            }else{
                low = medium;
            }
            medium = (low + high) / 2;
        }
        return nums[low] < nums[high] ? nums[low] : nums[high];
    }
}
