class Solution {
    public boolean areNumbersAscending(String s) {
        int prevDigit=-1;
        for(int i=0;i<s.length();i++){
            char ch= s.charAt(i);
            if(ch-'0' >=0 && ch-'0'<=9 ){
                int num = 0;
                while (i < s.length() && Character.isDigit(s.charAt(i))) {
                    num = num * 10 + (s.charAt(i) - '0');
                    i++;
                }
                if(num<=prevDigit){
                    return false;
                }
                prevDigit=num;
            }
        }
        return true;
    }
}