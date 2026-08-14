class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count=0;
        for(int i=0;i<items.size();i++){
            List<String> lst=items.get(i);
            if(ruleKey.equals("type") && lst.get(0).equals(ruleValue) ||
                 ruleKey.equals("color") && lst.get(1).equals(ruleValue) ||
                 ruleKey.equals("name") && lst.get(2).equals(ruleValue)  ){
                    count++;
            }
        }
        return count;
    }
}