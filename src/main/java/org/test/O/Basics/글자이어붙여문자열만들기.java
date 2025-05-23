package org.test.O.Basics;

public class 글자이어붙여문자열만들기 {

//    문자열 my_string과 정수 배열 index_list가 매개변수로 주어집니다.
//    my_string의 index_list의 원소들에 해당하는
//    인덱스의 글자들을 순서대로 이어 붙인 문자열을 return 하는 solution 함수를 작성해 주세요.

//    my_string	index_list	result
//"cvsgiorszzzmrpaqpe"	[16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7]	"programmers"
//        "zpiaz"	[1, 2, 0, 0, 3]	"pizza"


    public String solution(String my_string, int[] index_list) {
        StringBuilder sb = new StringBuilder();

        for (int idx: index_list){
            sb.append(my_string.charAt(idx));
        }

        return sb.toString();
    }


}

// 내코드
//    StringBuilder sb = new StringBuilder();
//
//        for (int i=0;i<index_list.length;i++){
//        sb.append(my_string.charAt(index_list[i]));
//        }
//        return sb.toString();
//
//        }