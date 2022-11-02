package programmers.level0;

import java.util.*;
import java.util.stream.IntStream;

public class NumberOfK {
    public static void main(String[] args) {
        int i = 10;
        int j = 500;
        int k = 5;
        int intArr[] = IntStream.rangeClosed(i,j).toArray();
        String[] strArray = Arrays.stream(intArr)
                .mapToObj(String::valueOf)
                .toArray(String[]::new);
        List<String> list = new ArrayList<>();
        for(String str : strArray) Arrays.asList(str.split("")).forEach(aa->list.add(aa));
        int answer = (int) list.stream().filter(str -> str.equals(String.valueOf(k))).count();
        //System.out.println(answer);

        int answer2 = 0;

        for(int n = i; n<=j; n++){

            String str = n+"";
            //System.out.println(str);
            for(int l = 0; l<str.length(); l++) {
                //System.out.println(str.charAt(l) - '0');
                if (str.charAt(l) - '0' == k) answer2++;
            }
        }
        System.out.println(answer2);
    }
}
