package part01.chapter03;

import java.util.function.*;

public class Function01 {

    /*
        Function 함수형 인터페이스
        - 전통적인 하나의 입력과 출력을 가진 함수
        - 사용 시, 단일 추상 메서드 apply를 사용한다.
     */

    public static void main(String[] args) {
        // 문자열 길이 추출_ 반복을 사용
        String str1 = "Hello, Function";
        int result1 = str1.length();
        System.out.println("\"Hello, Function\" 문자열의 길이는 " + result1 + " 이다.");


        // 문자열 길이 추출_ Function 함수형 인터페이스
        Function<String, Integer> stringLength = str2 -> str2 != null ? str2.length() : 0;
        int result2 = stringLength.apply("Hello, Function");

        System.out.println("\"Hello, Function\" 문자열의 길이는 " + result2 + " 이다.");


        int result3 = stringLength.apply(null);
        System.out.println("null 입력의 문자열 길이는 " + result3 + " 이다.");
    }
}
