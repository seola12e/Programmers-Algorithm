class Solution {
    public int solution(int n) {
        
        StringBuilder sb = new StringBuilder();
        
        while (n > 0) {
            sb.append(n % 3);
            n /= 3;
        }
        
        sb.reverse();
        
        int[] arr = new int[sb.toString().length()];
        int[] arr2 = sb.toString().chars().toArray();
        
        int result = 0;
        
        for (int i = 0; i < arr.length; i++) {
            result += (int) (Math.pow(3, i) * (arr2[i] - '0'));
        }
        
        return result;
    }
}