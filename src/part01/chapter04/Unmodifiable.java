package part01.chapter04;

import java.util.*;

public class Unmodifiable {

    public static void main(String[] args) {
        List<String> modifiable = new ArrayList<>();
        modifiable.add("a");
        modifiable.add("b");
        System.out.println("modifiable >>> " + modifiable.toString());

        List<String> unmodifiable = Collections.unmodifiableList(modifiable);
        System.out.println("unmodifiable >>> " + unmodifiable.toString());

//        unmodifiable.add("c");    // 불변 컬렉션 객체라서 추가하는 것이 불가능하다.


        // 원본 리스트
        List<String> original = new ArrayList<>();
        original.add("ORI");
        original.add("GINAL");

        // 복사본 생성
        // 불변 복제 방식으로 객체를 만들면 높은 수준의 불변성을 제공해준다.
        List<String> copiedList = List.copyOf(original);

        // 원본 리스트에 항목 추가
        original.add("ADD");

        System.out.println("original >>> " + original.toString());
        System.out.println("copiedList >>> " + copiedList.toString());  // original에 변화가 있어도 생성했을 때를 유지한다.


        // final 키워드
        final List<String> fruits = new ArrayList<>();
        System.out.println("fruits >>> " + fruits);

        fruits.add("Apple");    // 객체의 상태와 final은 상관이 없다.
        System.out.println("fruits >>> " + fruits);

//        fruits = new ArrayList();     // 이건 참조 변수값이 변하면서 불가능. 컴파일 에러 발생

    }
}
