class Solution {
    public int kthFactor(int n, int k) {
        ArrayList<Integer> lst = new ArrayList<>();
        int i;
        for(i=1;i<Math.sqrt(n);i++){
            if(n%i==0){
                lst.add(i);
                lst.add(n/i);
            }
        }
        if(i*i==n){
            lst.add(i);
        }
        Collections.sort(lst);
        if(k>lst.size()){
            return -1;
        }
        return lst.get(k-1);
    }
}