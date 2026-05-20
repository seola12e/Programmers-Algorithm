import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        
        int[] result = new int[score.length];
        List<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < score.length; i++) {
            list.add(score[i]);
            
            if (list.size() > k)
                list.remove(Collections.min(list));
            
            result[i] = Collections.min(list);
        }
        
        return result;
    }
}