import java.util.Arrays;

class Solution {
    public int solution(int number, int limit, int power) {
        
        int[] counts = new int[number];
        
        for (int i = 1; i <= number; i++) {
            int count = countDivisor(i);
            
            if (count > limit) counts[i-1] = power;
            else counts[i-1] = count;
        }
        
        return Arrays.stream(counts).sum();
    }

    private int countDivisor(int num) {
        double sqrt = Math.sqrt(num);
        int count = 1;
        
        for (int i = 2; i <= sqrt; i++) {
            if (num % i == 0) count++;
        }
        
        return sqrt == Math.floor(sqrt) ? count * 2 - 1 : count * 2;
    }
}