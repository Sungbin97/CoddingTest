package programmers.level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;

public class Follow_Up {
    public static void main(String[] args) {
        int n = 2;
        String words[] = {"hello", "one", "even", "never", "now", "world", "draw"};
        int answer[] = new int[2];

        List<String> last = new ArrayList<>();
        List<String> first = new ArrayList<>();
        for (int i = 0; i < words.length; i++) last.add(String.valueOf(words[i].charAt(words[i].length()-1)));
        for (int i = 1; i < words.length; i++) first.add(String.valueOf(words[i].charAt(0)));
        last.remove(last.size()-1);
        System.out.println("last: " + last);
        System.out.println("first: " + first);

        for (int i = 0; i < last.size(); i++) {
            if(!last.get(i).equals(first.get(i))){
                answer[0] = (i+2)%n;
                answer[1] = (i+2)/n+1;
            }
        }
        System.out.println(answer[0]);
        System.out.println(answer[1]);

        /*LinkedHashMap<Integer,List> map = new LinkedHashMap<>();
        for (int i = 1; i <= n; i++){
            map.put(i, new ArrayList());
            for (int j = 0; j < words.length; j = j+3) map.get(i).add(words[j+(i-1)]);
        }*/
        //System.out.println(map);

    }
}
