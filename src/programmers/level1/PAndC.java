package programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PAndC {
    public static void main(String[] args) {
        String s = "PLLLPPPYYUUNS";

        List<String> list = new ArrayList<>(Arrays.asList(s.toLowerCase().split("")));
        long pCnt = list.stream().filter(i -> i.equals("p")).count();
        long yCnt = list.stream().filter(i -> i.equals("y")).count();
        System.out.println("pCnt: " + pCnt);
        System.out.println("yCnt: " + yCnt);
        boolean answer = pCnt == yCnt ? true : false;
    }
}
