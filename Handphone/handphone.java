package Handphone;

public class handphone {
    protected String merk;
    protected String model;

    public handphone(String merk, String model) {
        this.merk = merk;
        this.model = model;
    }

    void nyalakan() {
        System.out.println("Handphone " + merk + " " + model + " sedang dihidupkan.");
    }

    void matikan() {
        System.out.println("Handphone " + merk + " " + model + " sedang dimatikan.");
    }

    void kirimPesan(String nomorTujuan, String pesan) {
        System.out.println("Kirim pesan ke " + nomorTujuan + ": " + pesan);
    }

    void kirimPesan2(String nomorTujuan1, String nomorTujuan2, String pesan) {
        System.out.println("Kirim pesan : " + pesan + "ke nomor " + nomorTujuan1 + " dan " + nomorTujuan2);
    }

    void kirimPesan(String[] daftarNomor, String pesan) {
        for (String nomor : daftarNomor) {
            System.out.println("Kirim pesan ke " + nomor + ": " + pesan);
        }
    }
}
