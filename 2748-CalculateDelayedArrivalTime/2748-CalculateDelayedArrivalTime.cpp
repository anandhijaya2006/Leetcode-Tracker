// Last updated: 7/9/2026, 3:06:18 PM
class Solution {
public:
    int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        if((arrivalTime+delayedTime) <24){
            return arrivalTime+delayedTime;
        }else{
            return 
           ( arrivalTime+delayedTime)%24;
        }
        
    }
};