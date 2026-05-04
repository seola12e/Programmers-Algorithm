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
                if (index % 2 == 0) sb.append(Character.toUpperCase(c));
                else sb.append(Character.toLowerCase(c));
                index++;
            }
        }
        
        return sb.toString();
    }
}