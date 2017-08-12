package Models;

/**
 * Created by mcfly on 10.08.2017.
 */

public class KullaniciEkrani {
    public void goster(Araba[] arabalar){
        for (int i = 0; i < arabalar.length; i++) {
            Araba araba = arabalar[i];
            System.out.println("Agirlik : "+araba.getAgirlik());
            System.out.println("Model : "+araba.getModel());
            System.out.println("Renk : "+araba.getRenk());
        }
    }
}
