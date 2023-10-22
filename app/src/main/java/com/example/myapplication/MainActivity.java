package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Binder;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class MainActivity extends AppCompatActivity {

    Button button,button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        button1=findViewById(R.id.button1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                BlankFragment blankFragment=new BlankFragment();

                blankFragment.show(getSupportFragmentManager(),blankFragment.getTag());

            }
        });


button1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {

        Dialog dialog=new Dialog(MainActivity.this);
        dialog.setContentView(R.layout.dailogelayout);

        ImageView image2=dialog.findViewById(R.id.image2);
        image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dialog.dismiss();


            }
        });


        dialog.show();










    }
});






    }
}