package edu.transport;

public class MainApp {
    public static void main(String[] args) {
        Mobil mobil = new Mobil("Toyoto", 167);
        Motor motor = new Motor("Hondo", 67);

        double jarak = 120;

        double waktuMobil = mobil.hitungWaktuTempuh(jarak);
        double waktuMotor = motor.hitungWaktuTempuh(jarak);

        System.out.println("Mobil       : " + mobil.getNama());
        System.out.println("Waktu Tempuh: " + waktuMobil + " jam");

        System.out.println();

        System.out.println("Motor       : " + motor.getNama());
        System.out.println("Waktu Tempuh: " + waktuMotor + " jam");
    }
}