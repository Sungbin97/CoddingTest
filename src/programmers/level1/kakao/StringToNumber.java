package programmers.level1.kakao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringToNumber {
    public static void main(String[] args) {
        String s = "one4seveneight";
        String strNumbers[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        List<String> list = new ArrayList<>(Arrays.asList(s.split("")));
        String concat = "";
        int answer = 0;
        for(String str : list){
            concat += str;
            for (int i = 0; i < strNumbers.length; i++) {
                if(concat.equals(strNumbers[i])){

                }
            }
        }


    }
}
