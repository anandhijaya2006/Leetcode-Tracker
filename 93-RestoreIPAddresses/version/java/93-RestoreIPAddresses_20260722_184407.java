// Last updated: 7/22/2026, 6:44:07 PM
1class Solution {
2    public static List<String> restoreIpAddresses(String s) {
3      
4        List<String> addresses = new ArrayList<>();
5     
6        List<String> address = new ArrayList<>();
7       
8        rec(s, 0, address, addresses);
9      
10        return addresses;
11    }
12    private static void rec(String s, int i, List<String> address, List<String> addresses) {
13       
14        if (address.size() == 4) {
15            if (i == s.length()) {
16              
17                addresses.add(String.join(".", address));
18            }
19        } else {
20         
21            for (int j = i + 1; j <= i + 3 && j <= s.length(); j++) {
22                String nextInt = s.substring(i, j);
23           
24                if (Integer.parseInt(nextInt) <= 255 && (nextInt.equals("0") || !nextInt.startsWith("0"))) {
25                   
26                    address.add(nextInt);
27                  
28                    rec(s, j, address, addresses);
29                   
30                    address.remove(address.size() - 1);
31                }
32            }
33        }
34    }
35}
36
37