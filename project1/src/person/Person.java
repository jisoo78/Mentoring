package person;

public class Person {
    private String name = "지수";
    private int age = 20;

    // 9. [실습] Person 클래스를 만들고 printInfo()와 increaseAge()를 호출하는 예제를 작성하시오.
    //

    Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printInfo() {
        System.out.println("유저의 이름: " + name);
        System.out.println("유저의 나이: " + age);
    }

    public void increaseAge() {
        age++;
    }


    public static void main(String[] args) {
        Person person = new Person();
        person.printInfo();
        person.increaseAge();
        person.printInfo();

        Person person2 = new Person("홍길동",30);
        person2.printInfo();
    }

}
