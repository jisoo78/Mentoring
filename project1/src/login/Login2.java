package login;

import java.util.Scanner;

public class Login2 {
    public static void main(String[] args) {
        System.out.println("==========로그인 시뮬레이션==========");
        Scanner sc = new Scanner(System.in);

        String id = new String();
        String pwd = new String();
        // 빈칸으로 넣는다면 저장된 로그인 정보가 없어 회원가입을 필수로 함
        String saveId = "";
        String savePwd = "";

        while (true) {
            System.out.println("================");
            System.out.println("1. 회원가입");
            System.out.println("2. 로그인");
            System.out.println("3. 종료");
            System.out.println("=>");
            int num = Integer.parseInt(sc.nextLine());
            System.out.println("=================");

            switch (num) {
                case 1:
                    System.out.println("회원가입을 선택하였습니다");
                    System.out.println("아이디를 입력하시오");
                    id = sc.nextLine();
                    saveId = id;
                    System.out.println("비밀번호를 입력하시오");
                    pwd = sc.nextLine();
                    savePwd = pwd;
                    continue;
                case 2:
                    System.out.println("로그인을 선택했습니다");
                    System.out.println("아이디를 입력하시오");
                    id = sc.nextLine();
                    if (!saveId.equals(id)) {
//                        saveId != id 이렇게 입력한다면 문자열 내용이 아닌 주소값을 비교하기 때문에 문제가 생깁니다
                        System.out.println("잘못된 아이디 입니다 다시 입력해주세요");
                        continue;
                    } else {
                        System.out.println("비밀번호를 입력하시오");
                        pwd = sc.nextLine();
                        if (!savePwd.equals(pwd)) {
                            System.out.println("잘못된 비밀번호입니다 다시 입력해주세요");
                            continue;
                        }
                        System.out.println("로그인에 성공했습니다!");
                    }
                    continue;
                case 3:
                    System.out.println("종료 버튼을 눌렀습니다 프로그램을 종료합니다");
                    return;
                default:
                    // 모두 해당이 되지 않는 경우
                    System.out.println("1 ~ 3 사이의 값을 입력해주세요");
            }
        }
    }
}
