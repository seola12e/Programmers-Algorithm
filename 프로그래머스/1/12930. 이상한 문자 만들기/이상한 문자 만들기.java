class Solution {
    public String solution(String s) {
        char[] arr = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        
        int index = 0;
        
        for (char c : arr) {
            if (c == ' ') {
                sb.append(" ");
                index = 0;
            } else {
                if (index % 2 == 0) sb.append(String.valueOf(c).toUpperCase());
                else sb.append(String.valueOf(c).toLowerCase());
                index++;
            }
        }
        
        return sb.toString();
    }
}