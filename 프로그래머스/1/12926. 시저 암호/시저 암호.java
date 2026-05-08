class Solution {
    public String solution(String s, int n) {
        
        String result = "";
        char[] arr = s.toCharArray();
        
        for (char c : arr) {
            if (c == ' ') 
                result += " ";
            
            if (Character.isUpperCase(c)) 
                result += (char) (((c -'A' + n) % 26) + 'A');
            else if (Character.isLowerCase(c))
                result += (char) (((c -'a' + n) % 26) + 'a');
        }
        
        return result;
    }
}