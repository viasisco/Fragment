package com.example.david.fragment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity
{
    String myString = "Je suis un string de l'activité principale"; //exemple de string que l'on veut utiliser même dans le fragment

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // le fragment statique est directement imbriqué dans le fichier XML

        // le fragment dynamique est chargé grâce au fragmentManager
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.myDynamicFragmenttLayout,new DynamicFragment())
                .commit();
    }
}
