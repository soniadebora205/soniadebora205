package Handphone;

public class featurephone extends handphone {

    public featurephone(String merk, String model) {
        super(merk, model);
    }

    @Override
    public void nyalakan() {
        System.out.println("Featurephone " + merk + " " + model + " " + "dinyalakan.");
    }
    
    @Override
    public void matikan() {
        System.out.println("Featurephone " + merk + " " + model + " " + "dimatikan.");
    }

    void mainGameSnake() {
        System.out.println(merk + " " + model + " bermain game snake.");
    }
}