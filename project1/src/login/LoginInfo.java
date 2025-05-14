package login;


import atm.Main;

public class LoginInfo {
    private String inputId;
    private String inputPwd;
    UserManage userManage = new UserManage();

    // 기본 보기
    public void menu() {
        System.out.println("================");
        System.out.println("1. 회원가입");
        System.out.println("2. 로그인");
        System.out.println("3. 종료");
        System.out.println("=>");
        System.out.println("=================");
    }



    // 종료



    // 로그인 이후 페이지
    public boolean success(String id, String pwd) {
        boolean success = userManage.login(id, pwd);
        if (success) {
            System.out.println("atm 시뮬레이션으로 이동합니다");
            // 다른 패키지의 메인 메서드 실행
            Main.main(null);
        }
        return success;
    }


}
