package edu.university.model;

public class Mahasiswa {
    private String NIM;
    private String nama;
    private double IPK;

    public Mahasiswa() {
    }

    public Mahasiswa(String NIM, String nama, double IPK) {
        this.NIM = NIM;
        this.nama = nama;
        this.IPK = IPK;
    }

    public String getNIM() {
        return NIM;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getIPK() {
        return IPK;
    }

    public void setIPK(double IPK) {
        this.IPK = IPK;
    }

    public String getKategoriIPK() {
        if (IPK >= 3.5) {
            return "Cumlaude";
        } else if (IPK >= 3.0) {
            return "Sangat Memuaskan";
        } else if (IPK >= 2.5) {
            return "Memuaskan";
        } else {
            return "Perlu Perbaikan";
        }
    }
}