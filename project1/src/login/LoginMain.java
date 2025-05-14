package login;

import java.util.Scanner;
import atm.Main;

public class LoginMain {
    public static void main(String[] args) {
        UserManage userManage = new UserManage();
        LoginInfo loginInfo = new LoginInfo();
        Scanner scanner = new Scanner(System.in);
        // 클래스 별로 나누어 기능 구분 o
        // 아이디 중복 확인 o
        // 배열(가변 배열 -> List) 내 저장? o
        // 로그인을 성공했다면 다른 선택지를 보여줄 수 있게 0
        while (true) {
            loginInfo.menu();
            int num = scanner.nextInt();
            scanner.nextLine();
            switch (num) {
                case 1:
                    System.out.println("회원가입을 선택하였습니다");
                    System.out.println("아이디를 입력하시오");
                    String id = scanner.nextLine();

                    System.out.println("비밀번호를 입력하시오");
                    String pwd = scanner.nextLine();

                    userManage.signUp(id, pwd);
                    break;

                case 2:
                    System.out.println("로그인을 선택했습니다");
                    System.out.println("아이디를 입력하시오");
                    id = scanner.nextLine();
                    System.out.println("비밀번호를 입력하시오");
                    pwd = scanner.nextLine();
                    userManage.login(id, pwd);
                    // 아이디 패스워드 로그인 메서드에 넘겨주고
                    // 로그인 메서드에서 아이디 비밀번호 받고 다시 유저의 로그인을 확인하는 메서드로 이동 후 리턴값 확인
//                    loginInfo.success(id, pwd);
                    boolean success = userManage.login(id, pwd);
                    if (success) {
                        System.out.println("atm 시뮬레이션으로 이동합니다");
                        // 다른 패키지의 메인 메서드 실행
                        Main.main(null);
                    }
                case 3:
                    System.out.println("종료 버튼을 눌렀습니다 프로그램을 종료합니다");
                    scanner.close();
                    return;

                default:
                    // 모두 해당이 되지 않는 경우
                    System.out.println("1 ~ 3 사이의 값을 입력해주세요");
                    break;
            }

        }

        // 비밀번호 유호성 확인(특수문자, 영문자, 숫자, 8~16자) 매우 어려움 (선택)
    }
}

