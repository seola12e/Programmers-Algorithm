class Solution {
    public double solution(int[] numbers) {
        
        int len = numbers.length;
        int mid = len / 2;
        
        if (len % 2 == 0) {
            double sum = numbers[mid] + numbers[mid - 1];
            return sum / 2;
        }
        else return (double) numbers[mid];
    }
}