package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void LoginClick(View view) {
        MyDialogFragment dialogFragment = new MyDialogFragment();
        FragmentManager manager = getSupportFragmentManager();
        dialogFragment.show(manager, "MyDialog");
    }
}