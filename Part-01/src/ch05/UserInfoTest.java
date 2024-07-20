package ch05;

public class UserInfoTest {
    public static void main(String[] args) {
        UserInfo user = new UserInfo();

        user.userHeight = 180;
        user.userWeight = 78;
        user.userGender = "남성";
        user.userName = "Tomas";
        user.userAge = 37;
        System.out.println(user.showUserInfo()); // 키가 180이고, 몸무게가 78킬로그램인 남성이 있습니다. 이름은 Tomas 이고, 나이는 37세 입니다.
    }
}
