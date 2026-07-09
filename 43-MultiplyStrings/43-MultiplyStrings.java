// Last updated: 7/9/2026, 3:12:08 PM
class Solution {
    public String multiply(String num1, String num2) {
        int l1 = num1.length();
        int l2 = num2.length();
        int[] res = new int[l1 + l2];

        if(l1==0 || l2==0 || num1.equals("0") || num2.equals("0")){
            return "0";
        }if(num1.equals("1")){
            return num2;
        }if(num2.equals("1")){
            return num1;
        }

        int i=l2-1;
        int pf=0;

        while(i>=0){
            int ival=num2.charAt(i)-'0';
            i--;

            int carry=0;
            int k=res.length-1-pf;
            int j=l1-1;

            while(j>=0 || carry!=0){
                int jval=(j>=0?num1.charAt(j)-'0':0);
                j--;

                int prod=ival*jval + carry + res[k];
                res[k]=prod%10;
                carry=prod/10;
                k--;
            }
            pf++;
        }
        String str = "";
        boolean flag=false;
        for(int t=0; t<res.length; t++){
            int val=res[t];

            if(val==0 && flag==false){
                continue;
            }else{
                flag=true;
                str+=val;
            }
        }
        return str; 
    }
}