// Last updated: 7/9/2026, 3:05:47 PM
class Solution {
    public boolean good(int sum){
        int p=-1;
        boolean inc=true,dec=true;
        while(sum>0){
            int dig=sum%10;
            sum/=10;
            if(p==-1) p=dig;
            else{
                if(dig>=p) inc=false;
                if(dig<=p) dec=false;
                p=dig;
            }
        }
        return inc || dec;
    }
    public long rec(int i,int tight,int digSum,int prev,int inc,int dec,char s[],long dp[][][][][][]){
        if(i==s.length) return !(inc==1 || dec==1  || good(digSum))?1:0;
        if(dp[i][tight][digSum][prev+1][inc][dec]!=-1) return dp[i][tight][digSum][prev+1][inc][dec];
        int limit=tight==1?s[i]-'0':9;
        long ans=0;
        for(int j=0;j<=limit;j++){
            ans+=rec(i+1,tight==1 && j==limit?1:0,digSum+j,prev==-1 && j==0?-1:j,(inc==1 && j>prev) || prev==-1?1:0,(dec==1 && j<prev) || prev==-1?1:0,s,dp);
        }
        return dp[i][tight][digSum][prev+1][inc][dec]=ans;
    }
    public long count(char s[]){
        // find not fancy numbers upto s
        int n=s.length;
        long dp[][][][][][]=new long[n][2][226][11][2][2];
        for(int a=0;a<n;a++){
            for(int b=0;b<2;b++){
                for(int c=0;c<226;c++){
                    for(int d=0;d<11;d++){
                        for(int e=0;e<2;e++){
                            for(int f=0;f<2;f++) dp[a][b][c][d][e][f]=-1;
                        }
                    }
                }
            }
        }
        return rec(0,1,0,-1,1,1,s,dp);    
    }
    public long countFancy(long l, long r) {
        return r-l+1-(count(Long.toString(r).toCharArray())-count(Long.toString(l-1).toCharArray()));
    }
}