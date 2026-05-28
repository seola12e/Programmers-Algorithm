import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<Integer> solution(int[] answers) {
        
        List<Integer> list = new ArrayList<>();
        
        int[] a = { 1, 2, 3, 4, 5 };
        int[] b = { 2, 1, 2, 3, 2, 4, 2, 5 };
        int[] c = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };
        
        int[] score = { 0, 0, 0 };
        
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == a[i % a.length]) score[0]++;
            if (answers[i] == b[i % b.length]) score[1]++;
            if (answers[i] == c[i % c.length]) score[2]++;
        }
        
        int max = Math.max(score[0], Math.max(score[1], score[2]));
        
        for (int i = 0; i < 3; i++)
            if (score[i] == max) list.add(i + 1);
        
        return list;
    }
}