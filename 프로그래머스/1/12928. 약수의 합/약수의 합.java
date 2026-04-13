class Solution {
    public int solution(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }
        
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (n % arr[i] == 0) {
                sum += arr[i];
            }
        }
        
        return sum;
    }
}