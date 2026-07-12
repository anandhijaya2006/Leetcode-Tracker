// Last updated: 7/12/2026, 9:00:48 PM
1class Solution {
2    public int secondsBetweenTimes(String startTime, String endTime) {
3        String[] start = startTime.split(":");
4        String[] end = endTime.split(":");
5
6        int ss = 
7            Integer.parseInt(start[0]) * 3600 +
8            Integer.parseInt(start[1]) * 60 +
9            Integer.parseInt(start[2]);
10        int es = 
11            Integer.parseInt(end[0]) * 3600 +
12            Integer.parseInt(end[1]) * 60 +
13            Integer.parseInt(end[2]);
14        return es - ss;
15    }
16}