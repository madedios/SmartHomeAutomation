package Lab005;

public class Light {
    private boolean isOn;
    public void turnOn() {
        isOn = true;
        System.out.println("Light is turned on with full brightness.");
        
    }

    public void turnOff() {
        isOn = false;
        System.out.println("Light is turned off.");
    }
}

