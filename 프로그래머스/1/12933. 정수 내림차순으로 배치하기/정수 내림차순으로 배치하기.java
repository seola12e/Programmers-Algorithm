import java.util.*;

class Solution {
    public long solution(long n) {
        char[] arr = String.valueOf(n).concat("").toCharArray();
        Arrays.sort(arr);
        
        StringBuilder sb = new StringBuilder(String.valueOf(arr));
        sb.reverse();
        
        return Long.parseLong(sb.toString());
    }
}