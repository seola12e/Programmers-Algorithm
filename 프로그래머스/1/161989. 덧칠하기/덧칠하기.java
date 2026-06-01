import java.util.Arrays;

class Solution {
    public int solution(int n, int m, int[] section) {
        
        int count = 0;
        
        int[] wall = new int[n];
        Arrays.fill(wall, 0);
        for (int i = 0; i < section.length; i++) {
            wall[section[i] - 1] = 1;
        }
        
        for (int i = 0; i < wall.length - m; i++) {
            if (wall[i] == 1) {
                count++;
                Arrays.fill(wall, i, i+m, 0);
            }
        }
        
        for (int i = wall.length-m; i < wall.length; i++) {
            if (wall[i] == 1) {
                count++;
                break;
            }
        }
        
        return count;
    }
}