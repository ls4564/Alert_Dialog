package com.example.alert_dialog;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
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

/**
 * The type Main activity.
 */
public class MainActivity extends AppCompatActivity  {
    /**
     * The Wall.
     */
    LinearLayout wall;
    /**
     * The Adb.
     */
    AlertDialog.Builder adb;
    /**
     * The Si.
     */
    Intent si;
    /**
     * The Random.
     */
    Random random;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        weddings();
        random = new Random();


    }

    /**
     * Weddings.
     */
    public void weddings ()
    {
        /*
        This function wedding all the widgets
         */
        wall = (LinearLayout) findViewById(R.id.wall);
    }

    /**
     * on click 1
     *
     * @param view the view
     */
    public void btn1_clicked(View view) {
        adb = new AlertDialog.Builder(this);

        adb.setTitle("Bar");
        adb.setMessage("Bar bat zona!!");
        AlertDialog ad=adb.create();
        ad.show();
    }

    /**
     * on click 2
     *
     * @param view the view
     */
    public void btn2_clicked(View view) {
        adb = new AlertDialog.Builder(this);

        adb.setTitle("Bar");
        adb.setMessage("Bar bat zona!!");
        adb.setIcon(R.drawable.bar);
        AlertDialog ad=adb.create();
        ad.show();
    }

    /**
     * on click 3
     *
     * @param view the view
     */
    public void btn3_clicked(View view) {
        adb = new AlertDialog.Builder(this);

        adb.setTitle("Bar");
        adb.setMessage("Bar bat zona!!");
        adb.setIcon(R.drawable.bar);
        adb.setPositiveButton("Exit", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        AlertDialog ad=adb.create();
        ad.show();
    }

    /**
     * on click 4
     *
     * @param view the view
     */
    public void btn4_clicked(View view) {
        adb = new AlertDialog.Builder(this);

        adb.setTitle("Bar");
        adb.setMessage("Bar bat zona!!");
        adb.setIcon(R.drawable.bar);
        adb.setPositiveButton("Exit", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();

            }
        });
        adb.setNegativeButton("Bar in Color", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                wall.setBackgroundColor(Color.rgb(random.nextInt(256) + 1, random.nextInt(256) + 1, random.nextInt(256) + 1));
            }
        });
        AlertDialog ad=adb.create();
        ad.show();
    }

    /**
     * on click 5
     *
     * @param view the view
     */
    public void btn5_clicked(View view) {
        adb = new AlertDialog.Builder(this);

        adb.setTitle("Bar");
        adb.setMessage("Bar bat zona!!");
        adb.setIcon(R.drawable.bar);
        adb.setPositiveButton("Exit", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        adb.setNegativeButton("Bar in Color", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                wall.setBackgroundColor(Color.rgb(random.nextInt(256) + 1, random.nextInt(256) + 1, random.nextInt(256) + 1));
            }
        });
        adb.setNeutralButton("Bar in White", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                wall.setBackgroundColor(Color.WHITE);
            }
        });
        AlertDialog ad=adb.create();
        ad.show();
    }




    @Override
    public boolean onCreateOptionsMenu (Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected (MenuItem item) {
        int id = item.getItemId();


        if(id == R.id.it2)
        {
            si = new Intent(this, MainActivity2.class);
            startActivity(si);
        }
        return true;

    }
}