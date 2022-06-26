package Adaptor;

public class MobileInterfaceImpl implements MobileInterface{
     private WallInterface wallInterface;

    public MobileInterfaceImpl(WallInterface wallInterface) {
        this.wallInterface = wallInterface;
    }

    @Override
    public Volt get3Volts() {
          Volt v240 = wallInterface.getVolts();
          int finalVoltage = v240.getVolt()/80;
        return new Volt(finalVoltage);
    }
}
