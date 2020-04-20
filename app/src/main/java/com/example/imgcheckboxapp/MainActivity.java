package com.example.imgcheckboxapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


   CheckBox chk;
   ImageView imgmath,imgsince,imgchinese,imgenglish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgmath = findViewById(R.id.imgmath);
        imgsince = findViewById(R.id.imgsince);
        imgchinese = findViewById(R.id.imgchinese);
        imgenglish = findViewById(R.id.imgenglish);

        imgmath.setVisibility(View.GONE);
        imgsince.setVisibility(View.GONE);
        imgchinese.setVisibility(View.GONE);
        imgenglish.setVisibility(View.GONE);
    }

    public void btnOK(View view) {
        int[] id ={R.id.chkmath,R.id.chksince,R.id.chkchinese,R.id.chkenglish};
        for(int i:id){
            chk = findViewById(i);
            if (chk.isChecked()){
                if (chk.getId() ==R.id.chkmath)
                    imgmath.setVisibility(View.VISIBLE);
                if (chk.getId() ==R.id.chksince)
                    imgsince.setVisibility(View.VISIBLE);
                if (chk.getId() ==R.id.chkchinese)
                    imgchinese.setVisibility(View.VISIBLE);
                if (chk.getId() ==R.id.chkchinese)
                    imgenglish.setVisibility(View.VISIBLE);

            }

        }

    }
}
