package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class AlertActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert_activity);
    }

    public void MyClick(View view) {
        MyDialogFragment myDialogFragment = new MyDialogFragment();
        FragmentManager manager = getSupportFragmentManager();
        myDialogFragment.show(manager, "MyDialog");

    }
}