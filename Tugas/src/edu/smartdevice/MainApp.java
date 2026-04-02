package edu.smartdevice;

public class MainApp {
    public static void main(String[] args) {
        SmartWatch watch = new SmartWatch();

        watch.chargeBattery(67);
        watch.connectWifi("Ferdonut");

        System.out.println("Battery Level: " + watch.getBatteryLevel() + "%");

        if (watch.isConnected()) {
            System.out.println("Connected to Wi-Fi: " + watch.getSsid());
        } else {
            System.out.println("Kayak eduroam sih");
        }
    }
}