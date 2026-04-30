class Solution {
    public String solution(String phone_number) {
        String start = "*".repeat(phone_number.length() - 4);
        String end = phone_number.substring(phone_number.length() - 4);
        return start + end;
    }
}