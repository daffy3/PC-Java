package ch11;

public class CompanyTest {
    public static void main(String[] args) {
        // static인 경우에는 클래스 이름을 참조하여야 한다.
        Company company1 = Company.getInstance();
        Company company2 = Company.getInstance();

        // 싱글톤 패턴
        System.out.println(company1); // ch11.Company@5acf9800
        System.out.println(company2); // ch11.Company@5acf9800
    }
}
