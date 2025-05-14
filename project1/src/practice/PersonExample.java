package practice;

public class PersonExample {
    public static void main(String[] args) {
        Person2 person2 = new Person2();
        person2.printInfo();
        person2.name = "jisoo";
        person2.age = 20;
        person2.increaseAge();
        person2.printInfo();
        person2.name = "jisoo2";
        person2.age = 15;
        person2.increaseAge();
        person2.printInfo();

        Person2 person3 = new Person2("jisoo3", 30);
        person3.printInfo();


    }
}
class Person2 {
    /**
     * 사람(Person)이라는 클래스를 만들고, 이름(name)과 나이(age)를 필드로 가진다.
     * 이 클래스에는 다음 조건을 만족하는 메서드를 추가하시오:
     * - 이름과 나이를 모두 출력하는 printInfo() 메서드
     * - 나이를 한 살 증가시키는 increaseAge() 메서드
     *
     * 사람 객체를 1명 생성하고, 위 두 메서드를 각각 호출하시오.
     */

     String name;
     int age;

    Person2() {}

    Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printInfo() {
        System.out.println(name);
        System.out.println(age);
    }

    public void increaseAge() {
        age++;
    }
}
