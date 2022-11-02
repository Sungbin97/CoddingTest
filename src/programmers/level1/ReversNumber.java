package programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReversNumber {
    //자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요.
    // 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.
    public static void main(String[] args) {
        long n = 321456;
        List<String> list = Arrays.asList(String.valueOf(n).split(""));
        long arr[] = new long[list.size()];
        for (int i = 0, j=arr.length-1; i < arr.length; i++,j--) {
            arr[i] = Integer.parseInt(list.get(j));
        }
        for (long i : arr) System.out.println(i);
    }
}
