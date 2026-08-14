class Solution {
    public int maxProduct(int n) {
        List<Integer> lst=new ArrayList<>();
        while(n>0){
            lst.add(n%10);
            n/=10;
        }
        int s=lst.size();
        int max=0;
        Collections.sort(lst);
        for(int i=s-1;i>0;i--){
            int p=lst.get(i)*lst.get(i-1);
            max=Math.max(max,p);
        }
        return max;
    }
}