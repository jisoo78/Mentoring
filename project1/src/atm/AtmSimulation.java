package atm;

import java.util.Scanner;

public class AtmSimulation {
    public static void main(String[] args) {

        System.out.println("========ATM 시뮬레이션==========");
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        // 잔액 선언 및 초기화
        int cost = 0;
        // 입금 금액 선언 및 초기화
        int outCost = 0;
        // 출금 금액 선언 및 초기화

        while (true) {
            System.out.println("=============");
            System.out.println("1. 잔액 조회");
            System.out.println("2. 입금");
            System.out.println("3. 출금");
            System.out.println("4. 프로그램 종료");
            System.out.println("=>");
            int num = Integer.parseInt(sc.nextLine());
            // 입력된 문자열을 정수형으로 변경
            // sc.nextInt() 는 줄바꿈으로 인해 문제가 생길 거 같음
            System.out.println("==================");

            if (num == 1) {
                System.out.println("현재 잔액은 " + sum + "원 입니다.");
            } else if (num == 2) {
                System.out.println("입금할 금액을 작성해주세요(숫자만 입력 가능");
                System.out.println("=>");
                cost = Integer.parseInt(sc.nextLine());
                sum += cost;
                System.out.println(cost + "원 입금되었습니다.");
                System.out.println("현재 잔액은" + sum + "원 입니다." );
            } else if (num == 3) {
                System.out.println("출금하실 금액을 작성해주세요(숫자만 입력 가능");
                System.out.println("=>");
                outCost = Integer.parseInt(sc.nextLine());
                if (sum > outCost) {
                    sum -= outCost;
                    System.out.println(outCost + "원 출금되었습니다.");
                    System.out.println("현재 잔액은" + sum + "원 입니다.");
                } else {
                    System.out.println("잔액이 부족합니다.");
                    continue;
                }
            } else if (num == 4) {
                System.out.println("프로그램을 종료합니다");
                break;
            } else {
                System.out.println("잘못된 입력입니다 다시 입력하세요");
                continue;
            }
        }
    }
}
