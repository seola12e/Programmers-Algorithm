import java.util.List;
import java.util.ArrayList;

class Solution {
    public int solution(String[] babbling) {
        
        int count = 0;
        
        List<String> list = new ArrayList<>();
        list.add("aya"); list.add("ye"); list.add("woo"); list.add("ma");
        
        for (String s : babbling) {
            StringBuilder sb = new StringBuilder();
            String last = "last";
            
            for (char c : s.toCharArray()) {
                sb.append(c);
                
                if (list.contains(sb.toString())) {
                    if (sb.toString().equals(last)) break;
                    
                    last = sb.toString();
                    sb.delete(0, sb.length());
                }
            }
            
            if (sb.length() == 0) count++;
        }
        
        return count;
    }
}