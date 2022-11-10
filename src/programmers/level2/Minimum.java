package programmers.level2;

public class Minimum {
    public static void main(String[] args) {
        int a[] = {1,4,2};
        int b[] = {5,4,4};

        int answer = 0;
        for (int i = 0; i < a.length; i++) {
            answer += a[i] * b[i];
        }
        System.out.println(answer);
    }
}
