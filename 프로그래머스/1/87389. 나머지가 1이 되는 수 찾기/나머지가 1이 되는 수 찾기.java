class Solution {
    public int solution(int n) {
        int x = 2;
        
        for (int i = 2; i < n; i++) {
            if ((n - 1) % i == 0) {
                x = i;
                break;
            }
        }
        
        return x;
    }
}