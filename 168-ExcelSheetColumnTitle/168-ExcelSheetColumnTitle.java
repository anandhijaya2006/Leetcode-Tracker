// Last updated: 7/9/2026, 3:10:18 PM
class Solution {
    public String convertToTitle(int num){
        StringBuffer ans = new StringBuffer();
        while(num > 0){
            num--;
            ans.append((char)((num % 26) + 65));
            num /= 26;
        }
        return ans.reverse().toString();

    
        
        
    }
}