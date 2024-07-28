package ch06;

import ch05.Customer;
import ch05.VIPCustomer;

public class Intro {
    // 08. 다운 캐스팅과 instanceof

    // 다운 캐스팅(down casting)

    // - 업 캐스팅된 클래스를 다시 원래의 타입으로 형 변환
    // - 하위 클래스로의 형 변환은 명시적으로 해야 한다.
    Customer vc = new VIPCustomer(10020,"이순신"); // 묵시적
    VIPCustomer vCustomer = (VIPCustomer) vc; // 명시적
}