package org.test.O.Beginner;

import java.util.Arrays;

public class 문자열정렬하기_1 {

//    문자열 my_string이 매개변수로 주어질 때, my_string 안에 있는 숫자만 골라 오름차순 정렬한 리스트를 return 하도록 solution 함수를 작성해보세요.

//    my_string	result
//"hi12392"	[1, 2, 2, 3, 9]
//        "p2o4i8gj2"	[2, 2, 4, 8]
//        "abcde0"	[0]



    public int[] solution(String my_string){

        char[] charArray = my_string.toCharArray();
        int arrayCount = 0;

        for (int i=0;i<charArray.length;i++){
            if (Character.isDigit(charArray[i])){
                arrayCount++;
            }
        }

        int[] result = new int[arrayCount];
        int resultIndex = 0;
        for (int j=0;j<charArray.length;j++){
            if (Character.isDigit(charArray[j])){
                result[resultIndex] = Integer.parseInt(String.valueOf(charArray[j]));
                resultIndex++;
            }
        }

        Arrays.sort(result);

        return result;

    }


}
