package practice;

import java.util.Scanner;

/**
 * - Scanner를 사용하여 입력받기
 * - if문을 사용하여 짝수/홀수 판단
 */
public class GaCha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력해주세요");
        int num = Integer.parseInt(sc.nextLine());
        if (num % 2 == 1) {
            System.out.println("해당 숫자는 홀수 입니다.");
        } else {
            System.out.println("해당 숫자는 짝수 입니다.");
            // early return 사용 방법?
        }
    }
}
