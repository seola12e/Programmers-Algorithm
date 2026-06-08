class Solution {
    public String solution(String X, String Y) {
        
        int[] xArr = new int[10];
        for (String x : X.split("")) {
            xArr[Integer.parseInt(x)]++;
        }
        
        int[] yArr = new int[10];
        for (String y : Y.split("")) {
            yArr[Integer.parseInt(y)]++;
        }
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 9; i >= 0; i--) {
            while (xArr[i] > 0 && yArr[i] > 0) {
                sb.append(i);
                xArr[i]--;
                yArr[i]--;
            }
        }
        
        if (sb.length() == 0) return "-1";
        if (sb.charAt(0) == '0') return "0";
        
        return sb.toString();
    }
}