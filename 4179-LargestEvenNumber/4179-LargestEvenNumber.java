// Last updated: 7/9/2026, 3:05:36 PM
class Solution {
    public String largestEven(String s) {

        StringBuilder result = new StringBuilder();
        int lastTwoPos = -1;

    
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '2') {
                lastTwoPos = i;
            }
        }

        
        if (lastTwoPos == -1) {
            return "";
        }

    
        for (int i = 0; i <= lastTwoPos; i++) {
            result.append(s.charAt(i));
        }

        return result.toString();
    
    
        
    }
}