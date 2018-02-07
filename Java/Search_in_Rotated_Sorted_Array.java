class Search_in_Rotated_Sorted_Array {
    public int search(int[] nums, int target) {
        if(nums.length == 0){
            return -1;
        }
        
        int low = 0;
        int high = nums.length - 1;
        int medium = (low + high) / 2;
        
        while(low + 1 < high){
            if(nums[medium] == target){
                return medium;
            }else if(nums[medium] < target){
                if(target > nums[high] && nums[medium] < nums[high]){
                    high = medium;
                }else{
                    low = medium;
                }
            }else{
                if(target <= nums[high] && nums[medium] > nums[high]){
                    low = medium;
                }else{
                    high = medium;
                }
            }
            medium = (low + high) / 2;
        }
        return nums[low] == target ? low : nums[high] == target ? high : -1;
    }
}
