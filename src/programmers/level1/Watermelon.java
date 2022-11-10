package programmers.level1;

public class Watermelon {
    public static void main(String[] args) {
        int n = 5;
        String answer = "";

        for (int i = 0; i < n; i++) {
            if(i%2 != 0) answer += "박";
            else answer += "수";
        }
        System.out.println(answer);
    }
}
