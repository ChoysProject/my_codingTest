package org.test.X.Beginner;

public class 잘라서배열에저장하기 {


//    문자열 my_str과 n이 매개변수로 주어질 때, my_str을 길이 n씩 잘라서 저장한 배열을 return하도록 solution 함수를 완성해주세요.

//    my_str	n	result
//"abc1Addfggg4556b"	6	["abc1Ad", "dfggg4", "556b"]
//        "abcdef123"	3	["abc", "def", "123"]

    public String[] solution(String my_str, int n) {

        String[] result = splitSolution(my_str, n);

        return result;


    }

    public String[] splitSolution(String value, int intValue){

        int length = value.length();
        int splitIndex = length % intValue == 0 ? length / intValue : (length / intValue) + 1;
        String[] answer = new String[splitIndex];
        for (int i=0;i<splitIndex;i++){
            int startIndex = i*intValue;
            int endIndex = Math.min(startIndex +intValue, length);

            answer[i] = value.substring(startIndex, endIndex);
        }
        return answer;
    }
}
