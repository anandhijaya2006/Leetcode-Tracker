// Last updated: 9/21/2026, 8:34:12 PM
1class Solution {
2    public List<String> addOperators(String num, int target) {
3        List<String> res = new ArrayList<>();
4        dfs(num, target, 0, 0, 0, "", res);
5
6        return res;
7    }
8
9    private void dfs(String num, int target, int start, long curr_val, long last_operand, String expression, List<String> res){
10        if(start == num.length()){
11            if(curr_val == target){
12                res.add(expression);
13            }
14            return;
15        }
16        for(int i = start;i<num.length();i++){
17            if(i>start && num.charAt(start) == '0') return;
18
19            String curr_num = num.substring(start, i+1);
20            long curr_num_val = Long.parseLong(curr_num);
21
22            if(start == 0){
23                dfs(num, target, i+1, curr_num_val, curr_num_val, curr_num, res);
24            }else{
25                dfs(num, target,i+1,curr_val+curr_num_val, curr_num_val, expression+"+"+curr_num, res);
26                dfs(num,target,i+1,curr_val-curr_num_val, -(curr_num_val), expression+"-"+curr_num, res);
27
28                dfs(num, target, i+1, curr_val-last_operand+last_operand*curr_num_val, last_operand*curr_num_val, expression+"*"+curr_num, res);
29            }
30        }
31    }
32}