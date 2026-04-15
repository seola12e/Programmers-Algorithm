import java.util.*;

class Solution {
    public long[] solution(long n) {
        String s = String.valueOf(n);
        long[] arr = new long[s.length()];
        
        for (int i = 0; i < s.length(); i++) {
            arr[i] = n % 10;
            n /= 10;
        }
        
        return arr;
    }
}