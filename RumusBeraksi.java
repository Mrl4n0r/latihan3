package latihan3;

public class RumusBeraksi {
    public static void main(String[] args) {

        Rumus maul = new Rumus();

        maul.sisi = 5;
        maul.hitungLuasPersegi();
        System.out.println("Hasil luas persegi (akses via getHasil): " + maul.getHasil());

        maul.panjang = 7;
        maul.lebar = 3;
        maul.hitungLuasPersegiPanjang();
        System.out.println("Hasil luas persegi panjang (akses via getHasil): " + maul.getHasil());
    }
}
