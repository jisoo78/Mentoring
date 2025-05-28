package login;

import java.util.Scanner;
import atm.Main;

public class LoginMain {
    public static void main(String[] args) {
        UserManage userManage = new UserManage();
        LoginInfo loginInfo = new LoginInfo();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            loginInfo.menu();
            int num = scanner.nextInt();
            scanner.nextLine();
            switch (num) {
                case 1:
                    System.out.println("회원가입을 선택하였습니다");
                    System.out.println("아이디를 입력하시오");
                    String id = scanner.nextLine();

                    String pwd;
                    // do while 을 통해 무조건 검사를 하고 지나간다
                    do {
                        System.out.println("비밀번호를 입력하시오 (영문·숫자·특수문자 조합, 8~16자)");
                        pwd = scanner.nextLine();
                        if (!UserManage.isValid(pwd)) {
                            System.out.println("유효하지 않은 비밀번호입니다. 다시 입력해 주세요.");
                        }
                    } while (!UserManage.isValid(pwd));

                    System.out.println("유저의 이름을 입력하시오: ");
                    String name = scanner.nextLine();

                    System.out.println("나이를 입력하시오: ");
                    int age = Integer.parseInt(scanner.nextLine());


                    userManage.signUp(id, pwd, name, age);
                    break;

                case 2:
                    System.out.println("로그인을 선택했습니다");
                    System.out.println("아이디를 입력하시오");
                    id = scanner.nextLine();
                    // 로그인 할 때 아이디가 없다면 -> 다른 아이디 로그인이나 회원가입으로 넘어가기
                    id = userManage.replay(id, scanner);

                    System.out.println("비밀번호를 입력하시오");
                    pwd = scanner.nextLine();
                    userManage.login(id, pwd);
                    boolean success = userManage.login(id, pwd);
                    if (success) {
                        System.out.println("atm 시뮬레이션으로 이동합니다");
                        // 다른 패키지의 메인 메서드 실행
                        Main.main(null);
                    }
                    break;

                case 3:
                    System.out.println("종료 버튼을 눌렀습니다 프로그램을 종료합니다");
                    scanner.close();
                    return;

                case 4:
                    System.out.println("회원 정보 수정 메뉴입니다");
                    System.out.print("수정할 아이디를 입력하시오: ");
                    String idModify = scanner.nextLine();

                    System.out.print("이름을 다시 입력하시오: ");
                    String newName = scanner.nextLine();

                    System.out.print("나이를 다시 입력하시오: ");
                    int newAge;
                    try {
                        newAge = Integer.parseInt(scanner.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("잘못된 나이 입력입니다. 숫자를 입력해주세요.");
                        break;
                    }

                    userManage.updateUserInfo(idModify, newName, newAge);
                    break;

                case 5:
                    System.out.println("회원 정보 확인하기\n 아이디를 입력해주세요");
                    String checkId = scanner.nextLine();


                case 6:
                    System.out.println("회원탈퇴를 선택했습니다\n아이디를 입력해주세요");
                    String removeId = scanner.nextLine();
                    System.out.println("비밀번호를 입력해주세요");
                    String removePwd = scanner.nextLine();

                    boolean delete = userManage.isWithdrawal(removeId, removePwd);
                    if (delete) {
                        System.out.println("정상");
                    } else {
                        System.out.println("실패");
                    }
                    break;

                default:
                    // 모두 해당이 되지 않는 경우
                    System.out.println("1 ~ 3 사이의 값을 입력해주세요");
                    break;
            }

        }
    }
}

