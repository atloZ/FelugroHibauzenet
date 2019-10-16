package com.example.felugrohibauzenet;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnKilep;
    private AlertDialog.Builder felugroAblak;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnKilep = findViewById(R.id.btnKilepes);

        felugroAblak = new AlertDialog.Builder(MainActivity.this);
        felugroAblak.create();
        felugroAblak.setTitle("Megerősités!");
        felugroAblak.setCancelable(false);

        felugroAblak.setPositiveButton("Nem", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });

        btnKilep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                felugroAblak.setMessage("Biztos kiszeretne lépni?");

                felugroAblak.setPositiveButton("igen", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                });

                felugroAblak.show();
            }
        });
    }
}
