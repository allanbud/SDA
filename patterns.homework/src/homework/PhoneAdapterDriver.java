package homework;


/**** To make chargers look different I decided to use different voltages
      Default charger or default voltage is Android                        */


public class PhoneAdapterDriver {
    public static void main(String args[]) {
        AndroidCharger iPhone = new Iphone();
        VoltageAdapter iPhoneAdapter = new VoltageAdapterImplantation(iPhone);
        System.out.println("Original iPhone voltage " + iPhone.getVoltage() + "V");
        System.out.println("iPhone adapted voltage is " + iPhoneAdapter.getVoltage() + "V");

/***** Because Android needs no adapter it would use its original charger ************/
        AndroidCharger android = new Android();
        VoltageAdapter androidAdapter = new VoltageAdapterImplantation(android);
        System.out.println("Original Android voltage " + android.getVoltage() + "V");
        System.out.println("Android adapted voltage is is " + androidAdapter.getVoltage() + "V");

        AndroidCharger microsoft = new Microsoft();
        VoltageAdapter microsoftAdapter = new VoltageAdapterImplantation(microsoft);
        System.out.println("Original Microsoft voltage " + microsoft.getVoltage() + "V");
        System.out.println("Microsoft adapted voltage is " + microsoftAdapter.getVoltage() + "V");
    }
}
