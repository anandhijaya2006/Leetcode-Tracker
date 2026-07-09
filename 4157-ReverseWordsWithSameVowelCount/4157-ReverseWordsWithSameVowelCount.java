// Last updated: 7/9/2026, 3:05:48 PM
class Solution {
    public String reverseWords(String s) {
        String[] w = s.split(" ");
        int v = count(w[0]);
        for(int i = 1;i<w.length;i++){
            if(count(w[i])== v){
                w[i] = new StringBuilder(w[i]).reverse().toString();
            }
        }
        return String.join(" ",w);
    }
    int count(String s){
        int c = 0;
        for(char ch: s.toCharArray())
        if("aeiou".indexOf(ch)!=-1)c++;
        return c;

    }
        
    
}