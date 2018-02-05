class Search_Insert_Position {
    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int medium = (low + high) / 2;
        while(low + 1 < high){
            if(nums[medium] == target){
                return medium;
            }else if(nums[medium] < target){
                low = medium;
            }else{
                high = medium;
            }
            medium = (low + high) / 2;
        }
        return target <= nums[low] ? low : target <= nums[high] ? high : high + 1;
    }
}
