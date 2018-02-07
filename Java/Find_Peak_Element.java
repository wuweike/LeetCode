class Find_Peak_Element {
    public int findPeakElement(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int medium = (low + high) / 2;
        
        while(low + 1 < high){
            if(nums[medium] < nums[medium + 1]){
                low = medium;
            }else{
                high = medium;
            }
            medium = (low + high) / 2;
        }
        return nums[low] > nums[high] ? low : high;
    }
}
