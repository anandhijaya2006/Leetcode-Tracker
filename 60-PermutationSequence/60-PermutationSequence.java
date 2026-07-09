// Last updated: 7/9/2026, 3:11:50 PM
class Solution {
    public String getPermutation(int n, int k) {
       List<Integer> ans = new ArrayList<>();
       int fact = 1;
       for(int i=1;i<=n;i++){
        fact*=i;
        ans.add(i);
       }
       fact/=n;
       k-=1;
       StringBuilder sb = new StringBuilder();
       while(true){
        sb.append(ans.get(k / fact));
        ans.remove(k / fact);
        if(ans.size() == 0)break;
        k%=fact;
        fact/=ans.size();
       }
       return String.valueOf(sb); 
    }
}