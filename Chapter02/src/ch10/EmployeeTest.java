package ch10;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employeeLee = new Employee();
        employeeLee.setEmployeeName("이순신");

        Employee employeeKim = new Employee();
        employeeKim.setEmployeeName("김유신");
        // employeeKim.serialNum++;
        // 아래 콘솔에 같은 값이 출력이 되는데 이는 같은 값을 공유한다는 걸 의미한다. - static 변수
        // 따라서 생성자 안에서 처리해주어야 한다.
        // Employee.serialNum - static 변수, static 메서드는 모두 클래스 이름을 참조하여 접근하여 사용한다.
        System.out.println(Employee.getSerialNum());
        System.out.println(employeeLee.getEmployeeName()+"님의 사번은 " + employeeLee.getEmployeeId()+ " 입니다.");
        System.out.println(employeeKim.getEmployeeName()+"님의 사번은 " + employeeKim.getEmployeeId()+ " 입니다.");

    }
}
