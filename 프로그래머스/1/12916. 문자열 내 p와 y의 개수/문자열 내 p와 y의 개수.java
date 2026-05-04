class Solution {
    boolean solution(String s) {
        
        String[] arr = s.toUpperCase().split("");
        
        int p_count = 0;
        int y_count = 0;
        
        for (String val : arr) {
            if (val.equals("P")) p_count++;
            else if (val.equals("Y")) y_count++;
        }
        
        if (p_count == y_count) return true;
        else return false;
    }
}