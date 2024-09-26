package Handphone;

public class smartphone extends handphone {

    public smartphone(String merk, String model) {
        super(merk, model);
    }

    @Override
    public void nyalakan() {
        System.out.println("Smartphone " + merk + " " + model + " sedang dihidupkan");
    }

    @Override
    public void matikan() {
        System.out.println("Smartphone " + merk + " " + model + " sedang dimatikan");
    }

    public void kirimPesan(String nomorTujuan, String pesan) {
        System.out.println("Sedang mengirim pesan ke " + nomorTujuan + " : " + pesan);
    }
    public void kirimPesan(String emailTujuan, String subjek, String pesan) {
        System.out.println("Subjek "+ subjek + " mengirim pesan ke " + emailTujuan + " ; " + pesan);
    }
    public void aksesInternet() {
        System.out.println("Smartphone sedang mengakses internet");
    }
}
