class PowXN {
    public double myPow(double x, int n) {
        if(n == 0){
            return 1;
        }
        
        if(n == -1){
            return 1 / x;
        }
        
        if(n == 1){
            return x;
        }
        
        if(n % 2 != 0){
            if(n % 2 < 0){
                double temp = myPow(x, (n + 1) / 2);
                return temp * temp * 1 / x;
            }else{
                double temp = myPow(x, (n - 1) / 2);
                return temp * temp * x;
            }
        }else{
            double temp = myPow(x, n / 2);
            return temp * temp;
        }        
    }
}
