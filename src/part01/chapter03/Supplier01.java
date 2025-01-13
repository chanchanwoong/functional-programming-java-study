package part01.chapter03;

import java.util.function.Supplier;

public class Supplier01 {

    /*
        Supplier 함수형 인터페이스
        - 출력만 있고 입력은 없는 함수
        - 사용 시, 단일 추상 메서드 get를 사용한다.
     */

    public static void main(String[] args) {
        Supplier<Double> random = () -> Math.random();
        Double result = random.get();

        System.out.println(result);
    }
}
