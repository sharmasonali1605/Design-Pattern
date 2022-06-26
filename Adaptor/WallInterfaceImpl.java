package Adaptor;

public class WallInterfaceImpl implements  WallInterface{
    @Override
    public Volt getVolts() {
        return new Volt(240);
    }
}
