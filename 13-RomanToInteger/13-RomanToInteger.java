// Last updated: 7/9/2026, 3:12:48 PM
class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer>map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int result = 0;
        for(int i=0;i<s.length();i++){
            int cv = map.get(s.charAt(i));
            int nv = 0;
            if(i+1<s.length()){
                nv = map.get(s.charAt(i + 1));
            }
            if(cv<nv){
                result-=cv;
            }else{
                result+=cv;
            }
        }
        return result;
    }
}