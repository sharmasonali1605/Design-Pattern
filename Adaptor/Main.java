package Adaptor;

public class Main {
    public static void main(String[] args) {
            WallInterface wallInterface = new WallInterfaceImpl();
            Volt v240 = wallInterface.getVolts();
            System.out.println(v240.getVolt());
            MobileInterface mobileInterface = new MobileInterfaceImpl(wallInterface);
            Volt v3= mobileInterface.get3Volts();
            System.out.println(v3.getVolt());

    }
}
