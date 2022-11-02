package programmers.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TreatmentOrder {
    public static void main(String[] args) {
        int emergency[] = {3, 76, 24};
        int answer[] = new int[emergency.length];
        int max = emergency[0];
        for (int i = 0; i < emergency.length; i++) {
            if(emergency[i] > max) {
                max = emergency[i];
                System.out.println(max);
            }
        }
    }
}
