package login;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

import static java.nio.file.Files.exists;

public class UserManage {
    // 유저가 입력한 값들을 다루는 메서드 집합
    private List<User> userList = new ArrayList<>();
    // 비밀번호 유효성 확인 정규식
    private static final String PASSWORD_PATTERN =
            "^(?=.*[A-Za-z])" +
                    "(?=.*\\d)" +
                    "(?=.*[~!@#$%^&*()_+`\\-={}\\[\\]|\\\\:;\"'<>,.?/])" +
                    ".{8,16}$";

    // 회원가입
    public void signUp(String id, String pwd, String name, int age) {
        if (isUserIdCheck(id)) {
            System.out.println("이미 존재하는 아이디입니다. 다시 입력해주세요: " + id);
            return;
        }
        UserInfo userInfo = new UserInfo(name, age);
        userList.add(new User(id, pwd, userInfo));
        System.out.println("회원가입 성공: " + id + "유저 정보" + userInfo);
    }

    // 로그인
    public boolean login(String id, String pwd) {
        for (User user : userList) {
            if (user.getId().equals(id) && user.getPwd().equals(pwd)) {
                System.out.println("로그인 성공: " + id);
                return true;
            }
        }
        System.out.println("로그인 실패: 아이디 또는 비밀번호 불일치");
        return false;
    }

    // 아이디 중복 체크 메서드
    public boolean isUserIdCheck(String id) {
        for (User user : userList) {
            if (user.getId().equals(id)) {
                return true;
            }
        }
        return false;
    }

    // 로그인 인증 메서드
    public boolean isUserLogin(String id, String pwd) {
        for (User user : userList) {
            if (user.getId().equals(id) && user.getPwd().equals(pwd)) {
                return true;
            }
        }
        return false;
    }

    // 비밀번호 유효성 확인
    private static final Pattern pattern = Pattern.compile(PASSWORD_PATTERN);

    public static boolean isValid(String password) {
        if (password == null) {
            return false;
        }
        return pattern.matcher(password).matches();
    }

    // 로그인 시 아이디가 없다면
    public String replay(String id, Scanner scanner) {
        while (!exists(id)) {
            System.out.println("입력하신 아이디는 없는 아이디 입니다.");
            System.out.println("회원가입을 원하신다면 1번, 다시 로그인을 원한다면 2번을 눌러주세요");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.println("회원가입을 선택했습니다");
                    System.out.println("아이디를 입력해주세요");
                    String newId = scanner.nextLine().trim();

                    String newPwd;
                    do {
                        System.out.println("비밀번호를 입력하시오 (영문·숫자·특수문자 조합, 8~16자)");
                        newPwd = scanner.nextLine();
                        if (!isValid(newPwd)) {
                            System.out.println("유효하지 않은 비밀번호입니다. 다시 입력해 주세요.");
                        }
                    } while (!isValid(newPwd));

                    System.out.println("유저의 이름을 입력하시오: ");
                    String name = scanner.nextLine();

                    System.out.println("나이를 입력하시오: ");
                    int age = Integer.parseInt(scanner.nextLine());

                    signUp(newId, newPwd, name, age);
                    return newId;

                case "2":
                    System.out.println("아이디를 다시 입력하시오: ");
                    id = scanner.nextLine();
                    break;

                default:
                    System.out.println("잘못된 입력입니다. 다시 입력하시오.");
            }
        }
        return id;
    }

    private boolean exists(String id) {
        for (User user : userList) {
            if (user.getId().equals(id)) {
                return true;
            }
        }
        return false;
    }

    public boolean updateUserInfo(String id, String newName, int newAge) {
        for (User user : userList) {
            if (user.getId().equals(id)) {
                // UserInfo가 null일 수도 있으니 새로 만든 뒤 set
                user.setUserInfo(new UserInfo(newName, newAge));
                System.out.println("회원 정보가 업데이트되었습니다: " + id
                        + " → " + user.getUserInfo());
                return true;
            }
        }
        System.out.println("존재하지 않는 아이디입니다: " + id);
        return false;
    }

    // 정보 확인
    public void checkUserInfo(String id) {
        for (User user : userList) {
            if (user.getId().equals(id)) {
                UserInfo userInfo = user.getUserInfo();
                System.out.println("회원 정보");
                System.out.println("아이디" + user.getId());
                System.out.println("이름" + userInfo.getName());
                System.out.println("나이" + userInfo.getAge());
                return;
            }
        }
    }

    // 아이디와 비밀번호를 매개변수로 받아 처리한다
    public boolean isWithdrawal(String id, String pwd) {

        boolean remove = userList.removeIf(user ->
                user.getId().equals(id) && user.getPwd().equals(pwd)
        );

        if (remove) {
            System.out.println("회원탈퇴 성공");
        } else {
            System.out.println("회원탈퇴 실패(아이디 또는 비밀번호)");
        }
        return remove;
    }


}
