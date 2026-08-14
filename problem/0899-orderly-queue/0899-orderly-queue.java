class Solution {
    public String orderlyQueue(String s, int k) {
        if(k==1){
            String clone=s;
            for(int i=1;i<s.length();i++){
                String generated = s.substring(i) + s.substring(0,i);
                if(generated.compareTo(clone)<0){
                    clone=generated;
                }
            }
            return clone;
        }       
        char[] str=s.toCharArray();
        Arrays.sort(str);
        return new String(str);
    }
}