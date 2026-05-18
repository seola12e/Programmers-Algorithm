class Solution {
    public int[] solution(String s) {
        
        int[] result = new int[s.length()];
        result[0] = -1;
        
        char[] c = s.toCharArray();

        for (int i = 1; i < s.length(); i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (s.charAt(i) == c[j]) {
                    result[i] = i - j;
                    break;
                } else result[i] = -1;
            }
        }
        
        return result;
    }
}