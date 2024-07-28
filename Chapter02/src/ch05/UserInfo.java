package ch05;

public class UserInfo {
    int userHeight;
    int userWeight;
    String userGender;
    String userName;
    int userAge;

    public String showUserInfo() {
        return "키가 " + userHeight + "이고, 몸무게가 " + userWeight + "킬로그램인 " + userGender + "이 있습니다. 이름은 " + userName + " 이고, 나이는 " + userAge
                + "세 입니다.";
    }
}
