package Models;


/**
 * Created by mcfly on 10.08.2017.
 */

public class Mercedes extends Araba {

    private int cantKalinligi;

    public int getCantKalinligi() {
        return cantKalinligi;
    }

    public void setCantKalinligi(int cantKalinligi) {
        this.cantKalinligi = cantKalinligi;
    }

    @Override
    int yaktigiBenziniHesapla() {
        return getAgirlik() * 3;
    }
}
