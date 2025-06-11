class Solution {
    public int maxDifference(String s) {
        int max = 0;
        HashMap<String, Integer> map = new HashMap<>();
        for(int ch = 'a'; ch < 'z'; ch++){
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ch){
            count ++;
            }
            map.put(ch, count);
        }
        List<String> = new ArrayList<>();
        List<Integer> = new ArrayList<>();

        for(int i = 0; i < s.length(); i++){
            
        }
        
        
        
    }
    return max;
}
}