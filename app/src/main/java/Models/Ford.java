package Models;

/**
 * Created by mcfly on 10.08.2017.
 */

public class Ford extends Araba {
    private int devirSayisi;

    public int getDevirSayisi() {
        return devirSayisi;
    }

    public void setDevirSayisi(int devirSayisi) {
        this.devirSayisi = devirSayisi;
    }

    @Override
    int yaktigiBenziniHesapla() {
        return getAgirlik() * 2;
    }
}
