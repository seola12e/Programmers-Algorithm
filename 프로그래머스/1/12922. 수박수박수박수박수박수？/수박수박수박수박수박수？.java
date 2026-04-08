class Solution {
    public String solution(int n) {
        StringBuilder sb = new StringBuilder();
        int len = n / 2;

        for (int i = 0; i < len; i++) sb.append("수박");
        if (n % 2 != 0) sb.append("수");
        
        return sb.toString();
    }
}