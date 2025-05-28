package person;

public class Method {
    public static void printInfo(String name, int age) {
        System.out.println("유저의 이름: " + name);
        System.out.println("유저의 나이: " + age);
    }

    public static int increaseAge(int age) {
        age++;
        System.out.println("늘어난 나이 :" + age);
        return age;
    }
}
