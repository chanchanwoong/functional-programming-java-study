package part01.chapter03;

import java.util.function.*;

public class Consumer01 {

    /*
        Consumer 함수형 인터페이스
        - 입력만 있고 출력을 없는 함수
        - 사용 시, 단일 추상 메서드 accept를 사용한다.
     */

    public static void main(String[] args) {
        Consumer<String> println = str -> System.out.println(str);
        println.accept("Hello, Consumer");
    }
}
