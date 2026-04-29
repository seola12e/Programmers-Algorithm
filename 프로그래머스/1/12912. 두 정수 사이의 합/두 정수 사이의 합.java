class Solution {
    public long solution(long a, long b) {
        if (a == b) return a;
        
        long sum = 0;
        
        if (a > b) {
            sum = b;
            b = a;
            a = sum;
            sum = 0;
        }
        
        for (long i = a; i <= b; i++) sum += i;
        return sum;
    }
}