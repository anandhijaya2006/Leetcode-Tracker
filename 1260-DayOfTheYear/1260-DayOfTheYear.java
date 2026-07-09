// Last updated: 7/9/2026, 3:07:18 PM
import java.time.LocalDate;
class Solution {
    public int dayOfYear(String date) {
        return LocalDate.parse(date).getDayOfYear();
    }
}