package practice;

public class Person {
    /**
     * 사람(Person)이라는 클래스를 만들고, 이름(name)과 나이(age)를 필드로 가진다.
     * 이 클래스에는 다음 조건을 만족하는 메서드를 추가하시오:
     * - 이름과 나이를 모두 출력하는 printInfo() 메서드
     * - 나이를 한 살 증가시키는 increaseAge() 메서드
     *
     * 사람 객체를 1명 생성하고, 위 두 메서드를 각각 호출하시오.
     */

    private String name;
    private int age;

    public void printInfo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int increaseAge() {
        return age++;
    }
}



