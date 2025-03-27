package org.test.O.Beginner;

public class 가장큰수찾기 {

//    정수 배열 array가 매개변수로 주어질 때, 가장 큰 수와 그 수의 인덱스를 담은 배열을 return 하도록 solution 함수를 완성해보세요.

//    array	result
//[1, 8, 3]	[8, 1]
//        [9, 10, 11, 8]	[11, 2]


    int[] answer = new int[2];

    public int[] solution(int[] array) {
        int[] answer = new int[2];

        for (int i=0;i<array.length;i++){
            if (answer[0] < array[i]){
                answer[0] = array[i];
                answer[1] = i;
            }
        }

        return answer;
    }
}
