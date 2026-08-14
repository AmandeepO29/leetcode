class Solution {
    public int smallestNumber(int n, int t) {
        int num=n;
        while(true){
            n=num;
            int p=1;
            while(n>0){
                p*=n%10;
                n/=10;
            }
            if(p%t==0){
                return num;
            }
            num++;
        }
    }
}