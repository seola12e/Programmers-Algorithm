import java.util.List;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        
        List<Integer> numbers = Arrays.stream(win_nums).boxed().toList();
        
        int match = 0;
        int zeros = 0;
        
        for (int n : lottos) {
            if (n == 0) zeros++;
            else if (numbers.contains(n)) match++;
        }
        
        int[] wins = new int[2];
        
        wins[0] = rank(match + zeros);
        wins[1] = rank(match);
        
        return wins;
    }
    
    private int rank(int num) {
        return switch (num) {
            case 6 -> 1;
            case 5 -> 2;
            case 4 -> 3;
            case 3 -> 4;
            case 2 -> 5;
            default -> 6;
        };
    }
}