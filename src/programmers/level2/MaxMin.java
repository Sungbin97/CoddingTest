package programmers.level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxMin {
    public static void main(String[] args) {
        String s = "1 2 3 4";
        List<String> list = new ArrayList<>(Arrays.asList(s.split(" ")));
        int max = list.stream().mapToInt(Integer::parseInt).max().getAsInt();
        int min = list.stream().mapToInt(Integer::parseInt).min().getAsInt();
        String answer = max + " " + min;
        System.out.println(answer);
    }
}
