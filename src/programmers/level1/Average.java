package programmers.level1;

public class Average {
    //정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        int answer = 0;
        for (int i : arr) answer += i;
        System.out.println((float)answer/arr.length);
    }
}
