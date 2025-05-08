package login;

import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String id = "jisoo";
        String pwd = "1234";
        // 빈칸으로 넣는다면 저장된 로그인 정보가 없어 회원가입을 필수로 함

        while (true) {
            System.out.print("1.회원가입 2.로그인 3.종료  : ");
            String Ch = scanner.nextLine();

            if ("1".equals(Ch)) {
                System.out.println("아이디를 입력하시오");
                String id_ch = scanner.nextLine();
                // 아이디 입력
                System.out.println("비밀번호를 입력하시오");
                String pwd_ch = scanner.nextLine();

                id = id_ch;
                // 입력한 아이디 저장
                pwd = pwd_ch;
                // 입력한 비밀번호 저장
            } else if ("2".equals(Ch)) {
                System.out.println("아이디를 입력하시오");
                String id_ch = scanner.nextLine();
                // 아이디 입력

                System.out.println("비밀번호를 입력하시오");
                String pwd_ch = scanner.nextLine();
                // 비밀번호 입력

                if (id.equals(id_ch) && pwd.equals(pwd_ch)) {
                    System.out.println("로그인 성공");
                } else {
                    System.out.println("로그인 실패");
                }
            } else if ("3".equals(Ch)) {
                System.out.println("프로그램 종료");
                return;
                //종료
            } else {
                System.out.println("다시 입력해주세요");
            }
        }
    }
}

