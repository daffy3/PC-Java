package ch04;

public class UserInfoTest {
    public static void main(String[] args) {
        UserInfo userLee = new UserInfo();
        UserInfo userKim = new UserInfo("b12345", "0987mnbvc", "Kim");

        userLee.userId = "a12345";
        userLee.userPassword = "zxcvb12345";
        userLee.userName = "Lee";
        userLee.userAddress = "Seoul, Korea";

        System.out.println(userLee.showUserInfo()); // 고객님의 아이디는 a12345이고, 등록된 이름은 Lee 입니다.
        System.out.println(userKim.showUserInfo()); // 고객님의 아이디는 b12345이고, 등록된 이름은 Kim 입니다.
    }
}
