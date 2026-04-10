class Solution {
    public int solution(int left, int right) {
        int result = 0;
        
        for (int i = left; i <= right; i++) {
            double sqrt = Math.sqrt(i);
            if (sqrt == Math.floor(sqrt)) result -= i;
            else result += i;
        }
        
        return result;
    }
}