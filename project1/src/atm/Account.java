package atm;

public class Account {
    private int sum;

    public Account() {
        this.sum = 0;
        // 잔액 0으로 초기화
    }

    public int getSum() {
        return sum;
        // getter 형식에 맞는 메서드명 작성
    }

    public void deposit(int cost) {
        if (cost == 0) {
            System.out.println("0원은 입금이 불가능 합니다.");
            return;
        }
        // early return 을 사용한 코드 가독성 높이기
        sum += cost;
        System.out.println(cost + "원 입금되었습니다.");
    }

    public void withdraw(int outCost) {
        if (sum > outCost) {
            sum -= outCost;
            System.out.println(outCost + "원 출금되었습니다.");
        }
        System.out.println("잔액이 부족하여 출금이 불가능 합니다.");

    }
}
