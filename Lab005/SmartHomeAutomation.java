package Lab005;
public class SmartHomeAutomation {
    public static void main(String[] args) {
        Light livingRoomLight = new Light();
        Thermostat livingRoomThermostat = new Thermostat();
        MusicPlayer musicPlayer = new MusicPlayer();

        RemoteControl remoteControl = new RemoteControl();

        // Set commands for different appliances
        Command turnOnLivingRoomLight = new TurnOnLightCommand(livingRoomLight);
        Command turnOffLivingRoomLight = new TurnOffLightCommand(livingRoomLight);
        Command increaseTemperature = new IncreaseTemperatureCommand(livingRoomThermostat);
        Command playMusic = new PlayMusicCommand(musicPlayer);
        Command stopMusic = new StopMusicCommand(musicPlayer);

        // Set a command and execute it
        remoteControl.setCommand(turnOnLivingRoomLight);
        remoteControl.pressButton();

        // Set a different command and execute it
        remoteControl.setCommand(increaseTemperature);
        remoteControl.pressButton();

        // Set another command and execute it
        remoteControl.setCommand(playMusic);
        remoteControl.pressButton();

        // You can also set additional commands
        remoteControl.setCommand(turnOffLivingRoomLight);
        remoteControl.pressButton();

        // You can set more commands as needed
        remoteControl.setCommand(stopMusic);
        remoteControl.pressButton();
    }
}