package org.test.X.Basics;

import java.util.Arrays;
import java.util.Collections;

public class 진료순서정하기 {

//    외과의사 머쓱이는 응급실에 온 환자의 응급도를 기준으로 진료 순서를 정하려고 합니다.
//    정수 배열 emergency가 매개변수로 주어질 때 응급도가 높은 순서대로 진료 순서를 정한 배열을 return하도록 solution 함수를 완성해주세요.


//    emergency	result
//[3, 76, 24]	[3, 1, 2]
//        [1, 2, 3, 4, 5, 6, 7]	[7, 6, 5, 4, 3, 2, 1]
//        [30, 10, 23, 6, 100]	[2, 4, 3, 5, 1]


    public int[] solution(int[] emergency) {
        // 결과 배열을 저장할 공간을 emergency 배열의 길이만큼 생성합니다.
        int[] answer = new int[emergency.length];

        // emergency 배열의 값을 Integer 타입으로 변환하여 복사합니다.
        // Collections.reverseOrder()를 사용하여 내림차순 정렬을 하려면 Integer[] 타입이 필요합니다.
        Integer[] sortedEmergency = new Integer[emergency.length];
        for (int i = 0; i < emergency.length; i++) {
            sortedEmergency[i] = emergency[i];
        }

        // 복사된 배열을 응급도가 높은 순서 (내림차순)로 정렬합니다.
        // 예를 들어 [3, 76, 24] -> [76, 24, 3]이 됩니다.
        Arrays.sort(sortedEmergency, Collections.reverseOrder());

        // 원본 emergency 배열의 각 요소를 순회하며 순위를 매깁니다.
        for (int i = 0; i < emergency.length; i++) {
            // 정렬된 배열을 순회하며 현재 emergency[i] 값의 순위를 찾습니다.
            for (int j = 0; j < sortedEmergency.length; j++) {
                // emergency[i]의 값이 sortedEmergency[j]와 같으면
                if (emergency[i] == sortedEmergency[j]) {
                    // 해당 위치(j)에 1을 더한 값(순위는 1부터 시작하므로)을 answer 배열에 저장합니다.
                    // 예를 들어, 76은 sortedEmergency에서 0번째 인덱스에 있으므로 순위는 0+1=1이 됩니다.
                    answer[i] = j + 1;
                    break; // 순위를 찾았으니 더 이상 내부 반복을 할 필요가 없습니다.
                }
            }
        }

        // 최종적으로 순위가 매겨진 배열을 반환합니다.
        return answer;
    }


}
