class Solution {
    public boolean solution(int x) {
        char[] arr = String.valueOf(x).concat("").toCharArray();
        
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += Integer.parseInt(String.valueOf(arr[i]));
        }
        
        return x % sum == 0 ? true : false;
    }
}