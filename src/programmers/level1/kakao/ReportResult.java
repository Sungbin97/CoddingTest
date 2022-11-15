package programmers.level1.kakao;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ReportResult {
    public static int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];

        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        LinkedHashMap<String, List> map2 = new LinkedHashMap<>();
        List<String> reporter = new ArrayList<>();
        List <String> reported = new ArrayList<>();

        List<String> reportDistinct = Arrays.stream(report).distinct().collect(Collectors.toList()); // 중복된 신고 제거

        for (String id : id_list) map.put(id, ""); // 신고자를 key로 저장

        for (int i = 0; i < reportDistinct.size(); i++) { // 중복된 신고를 제외한 List를 기준으로
                                                          // 신고자 + 피신고자 문자열을 신고자와 피신고자 List로 분할
            reporter.add(reportDistinct.get(i).substring(0, report[i].indexOf(" ")));
            reported.add(reportDistinct.get(i).substring(report[i].indexOf(" ")).replaceAll(" ", ""));
        }
        System.out.println("reporter: " + reporter);
        System.out.println("reported: " + reported);

        List<String> banList = new ArrayList<>(); // k번 이상 신고된 사람을 저장할 List
        Set<String> set = new HashSet<>(reported); // 신고된 사람을 중복없이 저장할 Set

        for (String str : set) { // k번 이상 신고된 사람을 banList에 추가
            if(Collections.frequency(reported, str) >= k)
                banList.add(str);
        }
        System.out.println("banList" + banList);
        
        for (int i = 0; i < reporter.size(); i++){ // 신고인(문자열)과 피신고인(문자열)을 map에 저장
            map.put(reporter.get(i)
                    , map.get(reporter.get(i)) + " " + reported.get(i));
        }
        System.out.println("map: " + map);

        for (int i = 0; i < map.size(); i++) { // 신고인(문자열)과 피신고인(리스트)을 map2에 저장
            map2.put(id_list[i],
                    Arrays.stream(
                                    map
                                            .get(id_list[i])
                                            .replaceFirst(" ", "")
                                            .split(" "))
                            .filter(j -> j != ""
                                    && banList.stream().anyMatch(Predicate.isEqual(j))) //정지당한 사람만 저장
                            .collect(Collectors.toList()));
        }

        System.out.println("map2: " + map2);
        for (int i = 0; i < id_list.length; i++) answer[i] = map2.get(id_list[i]).size(); // 신고자가 신고하여 정지당한 수를 구하여 answer에 저장
        for (int i : answer) System.out.println("answer: " + i);

        return answer;
    }
    public static void main(String[] args) {
        /*String[] id_list = {"con", "ryan"};
        String[] report = {"ryan con", "ryan con", "ryan con", "ryan con"};*/
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        int[] answer = {};
        solution(id_list, report, 2);
    }
}
