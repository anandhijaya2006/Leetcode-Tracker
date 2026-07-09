// Last updated: 7/9/2026, 3:06:13 PM
class Solution {
    public int differenceOfSums(int n, int m) {
        int num1 = 0,num2 = 0;
        for(int i=0;i<=n;i++){
            if(i%m==0){
                num2 = num2+i;
            }else{
                num1 = num1+i;
            }
            


        }
        return num1-num2;
        
    }
}