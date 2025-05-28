package user;

public class User {
    // 8. [실습] User 클래스를 만들고 private 필드에 접근할 수 있는 getter/setter 를 구현하시오.
    private String name;
    private int age;

    public User() {
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
