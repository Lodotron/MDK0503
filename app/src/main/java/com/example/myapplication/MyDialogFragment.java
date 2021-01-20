package com.example.myapplication;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class MyDialogFragment extends DialogFragment{
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View root = inflater.inflate(R.layout.dialoglayout, null);
        Button PositiveButton = root.findViewById(R.id.PositiveButton);
        Button NegativeButton = root.findViewById(R.id.NegativeButton);
        NegativeButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
                    public void onClick(View v){
                getDialog().cancel();
            }
        });
PositiveButton.setOnClickListener(new  View.OnClickListener(){
    @Override
    public void onClick(View v) {
        Toast.makeText(getActivity().getApplicationContext(),"Текст", Toast.LENGTH_SHORT).show();
        getDialog().cancel();
    }
                                      });
        builder.setView(root);
        return builder.create();
    }
}