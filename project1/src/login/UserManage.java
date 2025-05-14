package login;

import java.util.ArrayList;
import java.util.List;

public class UserManage {
    // 유저가 입력한 값들을 다루는 메서드 집합
    private List<User> userList = new ArrayList<>();

    // 회원가입
    public void signUp(String id, String pwd) {
        if (isUserIdCheck(id)) {
            throw new IllegalArgumentException("이미 존재하는 아이디 입니다 다시 입력해주세요" + id);
            //예외 처리?
        }
        try {
            userList.add((new User(id, pwd)));
        } catch (IllegalAccessError e) {
            System.out.println("회원가입 성공");

        }
    }

    // 로그인
    public boolean login(String id, String pwd) {
        for (User user : userList) {
            if (isUserLogin(id, pwd)) {
                System.out.println("로그인 성공: " + id);
                return true;
            }
        }
        throw new IllegalArgumentException("로그인 실패: 아이디 또는 비밀번호 불일치");
        // 예외 처리?
    }

    // 아이디 중복 체크 메서드
    public boolean isUserIdCheck(String id) {
        for (User user : userList) {
            if (user.getId().equals(id)) {
                throw new IllegalArgumentException("중복된 아이디 입니다 다시 입력해주세요");
                // 예외 처리
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

}
