package ch11;

public class Company {
    // 회사라는 객체는 유일해야 한다.
    // 지점이 여러 개일순 있지만, 동일한 회사는 없다.
    private static Company instance = new Company();

    private Company() {
    }

    public static Company getInstance() {
        if (instance == null) {
            instance = new Company();
        }
        return instance;
    }
}
