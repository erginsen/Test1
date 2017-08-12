package Models;

/**
 * Created by mcfly on 10.08.2017.
 */

public abstract class Araba {

    private int agirlik;
    private String renk;
    private String model;

    public int getAgirlik() {
        return agirlik;
    }

    public void setAgirlik(int agirlik) {
        this.agirlik = agirlik;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    abstract int yaktigiBenziniHesapla();
}
