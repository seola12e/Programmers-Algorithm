class Solution {
    public int solution(int n) {
        
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = i + 1;
        
        int sum = 0;
        for (int i = 1; i < n; i += 2) sum += arr[i];
        
        return sum;
    }
}