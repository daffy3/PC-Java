package ch06;

public class GenericPrinterTest {
    public static void main(String[] args) {

        Powder powder = new Powder();
        GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();
        powderPrinter.setMaterial(powder);

        Powder p1 = powderPrinter.getMaterial();
        System.out.println(p1);
        System.out.println(powderPrinter.toString());

        // ====================================================================================================

        Plastic plastic = new Plastic();
        GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<>();
        plasticPrinter.setMaterial(plastic);

        Plastic p2 = plasticPrinter.getMaterial();
        System.out.println(p2);
        System.out.println(plasticPrinter.toString());

    }
}
