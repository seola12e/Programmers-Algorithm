import java.util.Arrays;

class Solution {
    public int solution(int n, int m, int[] section) {
        
        int count = 0;
        int roller = 0;
        
        for (int paint : section) {
            if (roller <= paint) {
                count++;
                roller = paint + m;
            }
        }
        
        return count;
    }
}