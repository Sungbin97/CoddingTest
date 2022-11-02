package programmers.level1;

import java.util.Arrays;
import java.util.List;

import static java.lang.String.valueOf;

public class AddDigits {
    //자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
    //예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.
    public static void main(String[] args) {
        int n = 123;
        List<String> list = Arrays.asList(String.valueOf(n).split(""));
        int answer = list.stream().map(Integer::parseInt).reduce((i,j) -> i+j).get();
        System.out.println(answer);
    }
}
