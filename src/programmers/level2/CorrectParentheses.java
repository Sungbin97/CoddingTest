package programmers.level2;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CorrectParentheses {
    public static void main(String[] args) {
        String s= "()()";
        Map<Integer,String> map  = new HashMap<>();
        map.put(0,"(");
        map.put(1,")");
        String testStr = "";
        for (int i = 0; i < 4; i++) {
            int randomOne = ((int)(Math.random()*2));
            int randomTwo = ((int)(Math.random()*2));
            testStr += map.get(randomOne).concat(map.get(randomTwo));
        }
        //System.out.println(testStr);

        List<String> list = new ArrayList<>(Arrays.asList(testStr.split("")));
        int first = (int)list.stream().filter(i -> i.equals("(")).count();
        //System.out.println("first: " + first);
        int second = (int)list.stream().filter(i -> i.equals(")")).count();
       // System.out.println("second: " + second);

        boolean answer = testStr
                .endsWith(")")
                && first == second
                && testStr.startsWith("(")
                ? true : false;
        //System.out.println(answer);

        String str = "(())()";
        List<String> li = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            int j = i+2;
            j = j > str.length() ? j-1 : j;
            li.add(str.substring(i++, j));
        }
        //System.out.println(li);
        int size = li.size();

        List<String> first1 = li.subList(0, (size + 1) / 2);
        List<String> second1 = li.subList((size + 1) / 2, size);

        boolean result1 = false;
        boolean result2 = false;

        for (String f : first1){
            System.out.println(f);
            if(f.equals("((") || f.equals("()") || f.equals("))")){
                result1  = true;
                System.out.println("first1: " + result1);
            }else {
                result1 = false;
                System.out.println("first1: " + result1);
                break;
            }
        }
        for (String ss : second1){
            if(ss.equals("))") || ss.equals("()")){
                result2  = true;
                System.out.println("second1: " + result2);
            }else {
                result2 = false;
                System.out.println("second1: " + result2);
                break;
            }
        }
        answer = result1 == true && result2 == true ? true : false;
        System.out.println(answer);
        System.out.println("------------------------------------------");

        answer = false;
        int cnt = 0;

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(') cnt++;
            if (s.charAt(i) == ')') cnt--;
            if (cnt < 0) break;
            if (cnt == 0) answer = true;
            System.out.println(answer);
        }
    }
}
