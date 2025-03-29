package org.test.O.Beginner;

public class 외계행성나이 {
//    우주여행을 하던 머쓱이는 엔진 고장으로 PROGRAMMERS-962 행성에 불시착하게 됐습니다.
//    입국심사에서 나이를 말해야 하는데,
//    PROGRAMMERS-962 행성에서는 나이를 알파벳으로 말하고 있습니다. a는 0, b는 1, c는 2, ..., j는 9입니다.
//    예를 들어 23살은 cd, 51살은 fb로 표현합니다. 나이 age가 매개변수로 주어질 때
//    PROGRAMMER-962식 나이를 return하도록 solution 함수를 완성해주세요.

//    age	result
//     23	"cd"
//     51	"fb"
//     100	"baa"


    public String solution (int age){

        StringBuilder sb = new StringBuilder();
        String ageString = Integer.toString(age);

        for (int i=0;i<ageString.length();i++){

            switch(String.valueOf(ageString.charAt(i))){

                case "0" :
                    sb.append("a");
                    break;
                case "1" :
                    sb.append("b");
                    break;
                case "2" :
                    sb.append("c");
                    break;
                case "3" :
                    sb.append("d");
                    break;
                case "4" :
                    sb.append("e");
                    break;
                case "5" :
                    sb.append("f");
                    break;
                case "6" :
                    sb.append("g");
                    break;
                case "7" :
                    sb.append("h");
                    break;
                case "8" :
                    sb.append("i");
                    break;
                case "9" :
                    sb.append("j");
                    break;
            }

        }
        return sb.toString();
    }

}
