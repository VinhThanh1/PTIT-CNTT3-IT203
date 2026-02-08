package ss10;

public class bai4 {
    public static void main(String[] args) {

        // Anonymous Class
        RemoteControl smartLight = new RemoteControl() {
            @Override
            public void powerOn() {
                System.out.println("Đèn đã bật");
            }
        };

        // Test
        smartLight.powerOn();
        smartLight.checkBattery();
    }
}

interface RemoteControl {
    void powerOn();

    // default method (Java 8+)
    default void checkBattery() {
        System.out.println("Pin ổn định");
    }
}

