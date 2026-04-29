class Solution {
    
    static int count = 0;
    
    public long solution(long num) {
        long a = num;
        
        while (a > 0) {
            if (a == 1) break;
            if (count == 500) return -1;
            a = collatzCal(a);
        }
        
        return count;
    }
    
    private long collatzCal(long n) {
        long result = 0;
        
        if (n % 2 == 0) result = n / 2;
        else result = n * 3 + 1;
        
        count++;
        
        return result;
    }
}