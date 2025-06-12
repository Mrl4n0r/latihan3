package latihan3;

// Nama  : Muhammad Maulana
// NPM   : 2310010375
// Kelas : 4C

public class Rumus {
    int sisi;
    int panjang;
    int lebar;
    int hasil;

    public Rumus() {
        sisi = 0;
        panjang = 0;
        lebar = 0;
        hasil = 0;
    }

    public void hitungLuasPersegi() {
        hasil = sisi * sisi;
        System.out.println("Luas Persegi = " + hasil);
    }

    public void hitungLuasPersegiPanjang() {
        hasil = panjang * lebar;
        System.out.println("Luas Persegi Panjang = " + hasil);
    }

    public int getHasil() {
        return hasil;
    }
}
