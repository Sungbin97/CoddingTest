package programmers.level1.kakao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringToNumber {
    public static void main(String[] args) {
        String s = "one41seveneight";
        String answer = "";

        String strNumbers[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String numbers[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

        for (int i = 0; i < strNumbers.length; i++) {
            s = s.replaceAll(strNumbers[i], numbers[i]);
        }
        System.out.println(s);

    }
}
