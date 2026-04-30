import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] result = Arrays.stream(arr).filter(element -> element % divisor == 0).toArray();
        if (result.length == 0) result = new int[] { -1 };
        else Arrays.sort(result);
        return result;
    }
}