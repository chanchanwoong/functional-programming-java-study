package part01.chapter03;

import java.util.function.Function;

public class FunctionalComposition01 {

    /*
        함수 합성
        - 작은 함수들을 이용해서 크고 복잡한 작업을 처리하는 함수형 프로그래밍 방식
        - 글루 메서드를 이용하여 함수들 간의 연결고리를 만든다.
        -- 글루 메서드는 함수형 인터페이스에 구현되어 있기도 하지만, 없기도 하다.
     */

    public static void main(String[] args) {
        // 소문자 a의 모든 발생을 제거하고 그 결과를 대문자로 바꾸는 함수 합성

        Function<String, String> removeLowerCaseA = str -> str.replace("a", "");
        Function<String, String> upperCase = String::toUpperCase;

        var input = "abcd";

        // andThen 글루 메서드를 이용한 소문자 a 삭제 후, 대문자로 변경
        String result1 = removeLowerCaseA.andThen(upperCase)
                .apply(input);

        // compose 글루 메서드를 이용한 소문자 a 삭제 후, 대문자로 변경
        String result2 = upperCase.compose(removeLowerCaseA)
                .apply(input);


        System.out.println("result1 >>> " + result1 + "\nresult2 >>> " + result2);
    }
}
