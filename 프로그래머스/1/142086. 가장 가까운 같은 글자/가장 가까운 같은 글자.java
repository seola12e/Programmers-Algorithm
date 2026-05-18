import java.util.Arrays;

class Solution {
    public int[] solution(String s) {
        
        int[] result = new int[s.length()];
        Arrays.fill(result, -1);

        for (int i = 1; i < s.length(); i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (s.charAt(i) == s.charAt(j)) {
                    result[i] = i - j;
                    break;
                }
            }
        }
        
        return result;
    }
}