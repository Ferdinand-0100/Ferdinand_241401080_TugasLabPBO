package edu.university.model;

public class MainApp {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa("241401080", "Ferdinand", 4.67);
        Mahasiswa m2 = new Mahasiswa("241401081", "Tralalelo", 3.67);
        Mahasiswa m3 = new Mahasiswa("241401082", "TungTung", 2.67);

        Mahasiswa[] daftarMahasiswa = {m1, m2, m3};

        for (Mahasiswa m : daftarMahasiswa) {
            System.out.println("NIM : " + m.getNIM());
            System.out.println("Nama: " + m.getNama());
            System.out.println("IPK : " + m.getIPK());
            System.out.println("Kategori IPK: " + m.getKategoriIPK());
            System.out.println();
        }
    }
}