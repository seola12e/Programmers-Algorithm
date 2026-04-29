class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        int mul = n * m;
        int a = m;
        
        while (a > 0) {
            a = m % n;
            m = n;
            n = a;
        }
        
        answer[0] = m;
        answer[1] = mul / m;
        
        return answer;
    }
}