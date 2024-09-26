package Handphone;

public class main {
    public static void main(String[] args) {
        handphone hp1 = new handphone("Samsung", "Galaxy J8 Pro");
        featurephone hp2 = new featurephone("Nokia", "3310");

        hp1.nyalakan();
        hp1.kirimPesan("089876543210", "Halo, ini pesan test");
        hp1.matikan();

        System.out.println();

        hp2.nyalakan();
        hp2.kirimPesan("081234567890", "Hai, ini pesan test");
        hp2.mainGameSnake();
        hp2.matikan();

}
}