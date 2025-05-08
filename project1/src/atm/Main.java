package atm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("===============atm 시뮬레이션 메서드 구분===========");
        Scanner sc = new Scanner(System.in);
        Account account = new Account();    // 입금 출금
        Logic logic = new Logic(sc, account);

        while (true) {
            logic.menu();
            int num = Integer.parseInt(sc.nextLine());

            switch (num) {
                case 1:
                    logic.checkCost();  // 잔액 조회 메셔드
                    break;
                case 2:
                    logic.deposit();    // 입금 메서드
                    break;
                case 3:
                    logic.withdraw();   // 출금 메서드
                    break;
                case 4:
                    System.out.println("프로그램을 종료합니다");
                    return;
                default:
                    System.out.println("1 ~ 3 사이의 숫자를 선택해주세요.");
                    break;
            }
        }
    }
}
