package programmers.level2;

import java.util.Arrays;
import java.util.List;

public class RemovePairs {
    public static void main(String[] args) {
        String s = "baabaa";

        List<String> list = Arrays.asList(s.split(""));
        System.out.println(list);

        char c = s.charAt(0);
        System.out.println(c);
        for (int i = 0; i < list.size(); i++) {
            if (c != list.get(i).charAt(0)){
                System.out.println("1: " + c);
                   c = s.charAt(i);
                System.out.println("2: " + c);
                if(c == list.get(i).charAt(0)){
                    System.out.println("3: " + c);
                }
            }
        }
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {

        }












    }
}
