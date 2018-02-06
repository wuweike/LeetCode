class Intersection_of_Two_Arrays_II {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0;
        int j = 0;
        List<Integer> reList = new ArrayList<Integer>();
        
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] == nums2[j]){
                reList.add(nums1[i]);
                i++;
                j++;
            }else if(nums1[i] < nums2[j]){
                i++;
            }else{
                j++;
            }
        }
        int[] result = new int[reList.size()];
        
        for(int k = 0; k < reList.size(); k++){
            result[k] = reList.get(k);
        }
        return result;
    }
}
