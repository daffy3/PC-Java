package ch06;

public class ThreeDPrinterTest {
    public static void main(String[] args) {

        Powder power = new Powder();
        ThreeDPrinter3 printer = new ThreeDPrinter3();

        printer.setMaterial(power);

        Powder p = (Powder) printer.getMaterial();
    }
}
