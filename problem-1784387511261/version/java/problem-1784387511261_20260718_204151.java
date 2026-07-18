// Last updated: 7/18/2026, 8:41:51 PM
1class Solution {
2    public int[] scoreValidator(String[] events) {
3        int score = 0;
4        int counter = 0;
5        for(int i = 0; i < events.length; i++){
6            if(counter == 10){
7                break;
8            }
9            if(events[i].equals("W")){
10                counter++;
11            }else if(events[i].equals("WD") || events[i].equals("NB")){
12                score++;
13            }else{
14                score += Integer.parseInt(events[i]);
15            }
16        }
17        return new int[]{score, counter};
18    }
19}