import java.util.Arrays;

class Solution {
    public int[] solution(String s) {
        
        int[] index = new int[26];
        Arrays.fill(index, -1);
        
        int[] result = new int[s.length()];

        char c;
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            
            if (index[c - 'a'] == -1) result[i] = -1;
            else result[i] = i - index[c - 'a'];
            
            index[c - 'a'] = i;
        }
        
        return result;
    }
}