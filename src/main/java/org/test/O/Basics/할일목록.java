package org.test.O.Basics;

public class 할일목록 {


//    오늘 해야 할 일이 담긴 문자열 배열 todo_list와 각각의 일을 지금 마쳤는지를 나타내는 boolean 배열 finished가 매개변수로 주어질 때,
//    todo_list에서 아직 마치지 못한 일들을 순서대로 담은 문자열 배열을 return 하는 solution 함수를 작성해 주세요.

//    todo_list	finished	result
//["problemsolving", "practiceguitar", "swim", "studygraph"]	[true, false, true, false]	["practiceguitar", "studygraph"]

    public String[] solution(String[] todo_list, boolean[] finished) {

        int booleanIndex = 0;

        for (boolean value : finished){
            booleanIndex += !value ? 1 : 0;
        }

        String[] answer = new String[booleanIndex];

        int idx = 0;

        for (int i=0;i<todo_list.length;i++){
            if (!finished[i]){
                answer[idx] = todo_list[i];
                idx++;
            }
        }

        return answer;
    }
}
