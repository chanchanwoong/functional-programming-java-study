package part01.chapter03;

import java.util.function.*;

public class Predicate01 {

    /*
        Predicate 함수형 인터페이스
        - 입력을 받아 로직을 통해 테스트하고 결과를 boolean 타입으로 출력하는 함수
        - 사용 시, 단일 추상 메서드 test를 사용한다.
     */

    public static void main(String[] args) {
        Predicate<Integer> over1000 = i -> i > 1000;
        boolean result1 = over1000.test(10);
        boolean result2 = over1000.test(10000);

        System.out.println(result1);
        System.out.println(result2);
    }
}
