package programmers.level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JadenCase {
    public static void main(String[] args) {

        String s = "1AAAA BB3BBb C2CccCc";

        List<String> list = new ArrayList<>(Arrays.asList(s.split(" ")));

        String answer = list.stream()
                .map(i -> i.substring(0,1)
                        .toUpperCase() + i.substring(1)
                        .toLowerCase())
                .reduce((j,k) -> j + " " + k)
                .get();

        System.out.println(answer);
    }
}
