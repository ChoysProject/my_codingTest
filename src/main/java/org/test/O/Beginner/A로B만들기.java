package org.test.O.Beginner;

import java.util.*;

public class A로B만들기 {

    public int solution(String before,String after){

        char[] beforeArray = before.toCharArray();
        char[] afterArray = after.toCharArray();

        Arrays.sort(beforeArray);
        Arrays.sort(afterArray);

        return new String(beforeArray).equals(new String(afterArray)) ? 1 : 0;

    }
}
