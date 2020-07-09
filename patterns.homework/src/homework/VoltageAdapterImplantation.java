package homework;

public class VoltageAdapterImplantation implements VoltageAdapter {
    private AndroidCharger mobilePhones;

    public VoltageAdapterImplantation(AndroidCharger mobilePhones){
        this.mobilePhones = mobilePhones;
    }

    @Override
    public double getVoltage() {
        double V = mobilePhones.getVoltage();
        return convertAndroidChargerToOtherPhoneVoltage(V);
    }

    /**** We could have a list or Enums of compatible and uncompatible to Android phones */

    private double convertAndroidChargerToOtherPhoneVoltage(double V) {
        if (mobilePhones.getClass().getName().contains("Iphone")) {
            return V = V / 3.1; }
        else if (mobilePhones.getClass().getName().contains("Microsoft"))
        {
            return V = V / 5.1;
        }


        return V;
    }

}
