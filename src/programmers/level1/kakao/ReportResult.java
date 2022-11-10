package programmers.level1.kakao;

import java.util.*;
import java.util.stream.Collectors;

public class ReportResult {
    public static int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];

        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        LinkedHashMap<String, List> map2 = new LinkedHashMap<>();
        List<String> reporter = new ArrayList<>();
        List <String> reported = new ArrayList<>();

        for (String id : id_list) map.put(id, "");

        for (int i = 0; i < report.length; i++) {
            reporter.add(report[i].substring(0, report[i].indexOf(" ")));
            reported.add(report[i].substring(report[i].indexOf(" ")).replaceAll(" ", ""));
        }
        System.out.println("reporter: " + reporter);
        System.out.println("reported: " + reported);

        List<String> banList = new ArrayList<>(); // k번 이상 신고된 사람
        Set<String> set = new HashSet<>(reported);
        for (String str : set) {
            if(Collections.frequency(reported, str) >= k)
                banList.add(str);
        }
        System.out.println("banList" + banList);

        for (int i = 0; i < reporter.size(); i++){
            map.put(reporter.get(i)
                    , map.get(reporter.get(i)) + " " + reported.get(i));
        }
        System.out.println(map);

        for (int i = 0; i < map.size(); i++) {
            map2.put(id_list[i],
                    Arrays.stream(map
                            .get(id_list[i])
                            .replaceFirst(" ", "")
                            .split(" "))
                            .filter(j -> j != "")
                            .collect(Collectors.toList()));
        }
        System.out.println(map2);
        List<List> lists = new ArrayList<>();
        for (int i = 0; i < map.size(); i++) {
            lists.add(
                    Arrays.stream(map
                                    .get(id_list[i])
                                    .replaceFirst(" ", "")
                                    .split(" "))
                                    .filter(j -> j != "")
                                    .collect(Collectors.toList())
            );
        }
        System.out.println("lists: " + lists);


        return answer;
    }
    public static void main(String[] args) {
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};
        int[] answer = {};
        solution(id_list, report, 2);
    }
}
