package com.example.alert_dialog;

import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity  {
    LinearLayout wall;
    AlertDialog.Builder adb;
    Random random;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        weddings();
        random = new Random();


    }

    public void weddings ()
    {
        /*
        This function wedding all the widgets
         */
        wall = (LinearLayout) findViewById(R.id.wall);
    }

    public void btn1_clicked(View view) {
        adb = new AlertDialog.Builder(this);

        adb.setTitle("Bar");
        adb.setMessage("Bar bat zona!!");
        AlertDialog ad=adb.create();
        ad.show();
    }

    public void btn2_clicked(View view) {
        adb = new AlertDialog.Builder(this);

        adb.setTitle("Bar");
        adb.setMessage("Bar bat zona!!");
        adb.setIcon(R.drawable.bar);
        AlertDialog ad=adb.create();
        ad.show();
    }

    public void btn3_clicked(View view) {
        adb = new AlertDialog.Builder(this);

        adb.setTitle("Bar");
        adb.setMessage("Bar bat zona!!");
        adb.setIcon(R.drawable.bar);
        adb.setPositiveButton("Fuck Bar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        AlertDialog ad=adb.create();
        ad.show();
    }

    public void btn4_clicked(View view) {
        adb = new AlertDialog.Builder(this);

        adb.setTitle("Bar");
        adb.setMessage("Bar bat zona!!");
        adb.setIcon(R.drawable.bar);
        adb.setPositiveButton("Fuck Bar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                wall.setBackgroundColor(Color.rgb(random.nextInt(256) + 1, random.nextInt(256) + 1, random.nextInt(256) + 1));
            }
        });
        AlertDialog ad=adb.create();
        ad.show();
    }

    public void btn5_clicked(View view) {
        adb = new AlertDialog.Builder(this);

        adb.setTitle("Bar");
        adb.setMessage("Bar bat zona!!");
        adb.setIcon(R.drawable.bar);
        adb.setPositiveButton("Fuck Bar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                wall.setBackgroundColor(Color.WHITE);
            }
        });
        AlertDialog ad=adb.create();
        ad.show();
    }


}