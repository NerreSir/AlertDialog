package com.liontertainment.alertdialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Context
        //1.Aktivity Context   this yada MainActivity.this
        //2.App Context        getApplicationContext()

        //burası önemli bi miktar karışık
        Toast.makeText(MainActivity.this, "Toast Message", Toast.LENGTH_LONG).show();
    }

    public void save (View view){

        AlertDialog.Builder alert = new AlertDialog.Builder(this);

        alert.setTitle("Save it");
        alert.setMessage("Are u Sure?");

        alert.setPositiveButton("Yess", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                //kaydetme işlemi yapıcak
                Toast.makeText(MainActivity.this, "Savedd", Toast.LENGTH_LONG).show();
            }
        });

        alert.setNegativeButton("Noo", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this, "Not Savedd", Toast.LENGTH_SHORT).show();
            }
        });
        alert.show();


    }





} //end of the main activity
