class SqrtX {
    public int mySqrt(int x) {
        if(x == 0){
            return x;
        }
        long low = 0;
        long high = Integer.MAX_VALUE;
        long medium = (low + high) / 2;
        
        while(low + 1 < high){
            if(medium * medium == x){
                return (int)medium;
            }else if(medium * medium < x){
                low = medium;
            }else{
                high = medium;
            }
            medium = (low + high) / 2;
        }
        return (int) (high * high == x ? high : low);
    }
}
