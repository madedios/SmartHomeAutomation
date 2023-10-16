package Lab005;

public class Thermostat {
    private int temperature;

    public Thermostat() {
        temperature = 20;
    }
    public void increaseTemperature() {
        temperature++;
        System.out.println("Temperature increased to " + temperature + "°C.");
    }

    public void decreaseTemperature() {
        temperature--;
        System.out.println("Temperature decreased to " + temperature + "°C.");
    }
}
