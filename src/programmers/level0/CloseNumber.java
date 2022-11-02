package programmers.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CloseNumber {
    public static void main(String[] args) {
        int n = 20;
        int array[] = {21, 33, 19};
        Arrays.sort(array);
        List<Integer> absList = new ArrayList<>(); // 절대값 담을 리스트
        for(int t: array) absList.add(Math.abs(t - n));
        for (int a : array) System.out.println(a);
        System.out.println("absList: " + absList);
        int min = Collections.min(absList); // 절대값 리스트 중 최소값
        int idx = absList.indexOf(min); // 최소값의 index
        int answer = array[idx];
        System.out.println(answer);
    }
}
