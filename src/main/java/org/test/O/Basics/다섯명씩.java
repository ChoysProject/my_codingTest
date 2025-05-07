package org.test.O.Basics;

public class 다섯명씩 {


//    최대 5명씩 탑승가능한 놀이기구를 타기 위해 줄을 서있는 사람들의 이름이 담긴 문자열 리스트 names가 주어질 때,
//    앞에서 부터 5명씩 묶은 그룹의 가장 앞에 서있는 사람들의 이름을 담은 리스트를 return하도록 solution 함수를 완성해주세요.
//    마지막 그룹이 5명이 되지 않더라도 가장 앞에 있는 사람의 이름을 포함합니다.


//    names	result
//["nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx"]	["nami", "vex"]

    public String[] solution(String[] names) {
        int count = 0;
        int idx = 0;

        for (int i=0;i<names.length;i++){
            if (i==0 || i%5==0){
                count++;
            }
        }

        String[] result = new String[count];

        for (int j=0;j<names.length;j++){
            if (j==0 || j%5 ==0){
                result[idx] = names[j];
                idx++;
            }
        }

        return result;
    }

//    int idx = 0;
//    String[] answer = new String[names.length % 5 == 0 ? names.length / 5 : names.length / 5 + 1];
//        for (int i = 0;i < names.length;i+=5)
//    answer[idx++] = names[i];
//        return answer;

}
