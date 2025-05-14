package atm;

import java.util.Scanner;

public class Logic {
    private final Scanner sc;
    private final Account account;

    public Logic(Scanner sc, Account account) {
        this.sc = sc;
        this.account = account;
    }
    public void menu() {
        System.out.println("=============");
        System.out.println("1. 잔액 조회");
        System.out.println("2. 입금");
        System.out.println("3. 출금");
        System.out.println("4. 프로그램 종료");
        System.out.println("=>");
    }

    // 잔액 조회 메서드
    public void checkCost() {
        System.out.println("현재 잔액은" + account.getSum() +"원 입니다");
    }

    // 입금 메서드
    public void deposit() {
        System.out.println("입금할 금액을 작성해주세요(숫자만 입력 가능)");
        int cost = Integer.parseInt(sc.nextLine());
        account.deposit(cost);
        System.out.println("현재 잔액은" + account.getSum() + "원 입니다.");
    }

    // 출금 메서드
    public void withdraw() {
        System.out.println("출금할 금액을 작성해주세요(숫자만 입력 가능)");
        int outCost = Integer.parseInt(sc.nextLine());
        // 예외처리 넣어 리팩토링 진행
        account.withdraw(outCost);
        System.out.println("현재 잔액은" + account.getSum() + "원 입니다.");
    }
}
