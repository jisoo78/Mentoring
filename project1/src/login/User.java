package login;

public class User {
    // 유저의 정보를 담는 클래스
    private String id;
    private String pwd;
    private UserInfo userInfo;

    public User() {
        // 사용자 지정 생성자를 만들었으니 기본 생성자도 생성하자
    }

    public User(String id, String pwd, UserInfo userInfo) {
        this.id = id;
        this.pwd = pwd;
        this.userInfo = userInfo;
    }

    // 로그인할 때 로그인 로직에서 사용함
    // 회원가입 시 저장된 정보와 일치해야하기 때문에
    public String getId() {
        return id;
    }

    public String getPwd() {
        return pwd;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    @Override
    public String toString() {
        return "User{id='" + id + "', userInfo=" + userInfo + "}";
    }
}
