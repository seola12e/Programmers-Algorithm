import java.util.Arrays;

class Solution {
    public long solution(int n, int[] lost, int[] reserve) {

        int[] student = new int[n+2];
        student[0] = -1; student[n+1] = -1;
        
        Arrays.sort(lost);
        Arrays.sort(reserve);

        // 잃어버린 학생 = 1 / 체육복이 있는 학생 = 0 / 배열의 맨앞뒤 = -1
        for (int i = 0; i < lost.length; i++) {
            student[lost[i]] = 1;
        }

        // 본인이 잃어버린 학생이라면 본인 체육복을 본인에게
        for (int i = 0; i < reserve.length; i++) {
            if (reserve[i] > 0 && student[reserve[i]] > 0) {
                student[reserve[i]] = 0;
                reserve[i] = -1;
            }
        }
        
        for (int i = 0; i < reserve.length; i++) {
            // 앞사람이 체육복이 없으면
            if (reserve[i] > 0 && student[reserve[i]-1] > 0) {
                student[reserve[i]-1] = 0;
                reserve[i] = -1;
            }
            
            // 뒷사람이 체육복이 없으면
            if (reserve[i] > 0 && student[reserve[i]+1] > 0) {
                student[reserve[i]+1] = 0;
                reserve[i] = -1;
            }
        }

        return Arrays.stream(student).filter(x -> x == 0).count();
    }
}