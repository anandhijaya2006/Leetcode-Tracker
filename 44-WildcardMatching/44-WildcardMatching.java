// Last updated: 7/9/2026, 3:12:07 PM
class Solution {
    public boolean isMatch(String s, String p) {
        int si = 0;
        int pi = 0;
        int match = 0;
        int star = -1;
        int sn = s.length();
        int pn = p.length();
        while(si < sn){
            if(pi < pn && (p.charAt(pi) == '?' || p.charAt(pi) == s.charAt(si))) {
                si++;
                pi++;
            }else if(pi < pn && p.charAt(pi) == '*'){
                star = pi;
                match = si;
                pi++;
            }else if(star != -1){
                pi = star + 1;
                match++;
                si = match;
            }else{
                return false;
            }
        }
        while(pi < pn && p.charAt(pi) == '*'){
            pi++;
        }
        return pi == pn;
    }
}