package com.delorean.mcfly.delorean;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.Button;

import Models.Araba;
import Models.BaseClass;
import Models.Class1;
import Models.Class2;
import Models.Class3;
import Models.Ford;
import Models.KullaniciEkrani;
import Models.Mercedes;

public class MainActivity extends AppCompatActivity {

    Button mButton = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        mButton = (Button) findViewById(R.id.button);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog d = new Dialog(getApplicationContext());
                mButton.setText("Test");

            }
        });
        */


        BaseClass c1 = new Class1();
        c1.deneme();


        Araba ford =new Ford();
        ford.setAgirlik(1000);
        ford.setModel("Fiesta");
        ford.setRenk("Gri");

        Araba mercedes=new Mercedes();
        mercedes.setAgirlik(2000);
        mercedes.setModel("E200");
        mercedes.setRenk("Siyah");

        Araba arabalar[]=new Araba[]{mercedes,ford};
        KullaniciEkrani ekran =new KullaniciEkrani();
        ekran.goster(arabalar);

    }
}
