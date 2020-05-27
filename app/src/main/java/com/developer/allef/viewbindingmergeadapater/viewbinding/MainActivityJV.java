package com.developer.allef.viewbindingmergeadapater.viewbinding;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.developer.allef.viewbindingmergeadapater.R;
import com.developer.allef.viewbindingmergeadapater.databinding.ActivityMainjvBinding;
import com.developer.allef.viewbindingmergeadapater.mergeadapter.MergeActivity;

public class MainActivityJV extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainjvBinding binding = ActivityMainjvBinding.inflate(LayoutInflater.from(this));
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("Ir Para Agenda");

        binding.btnAgenda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivityJV.this, MergeActivity.class));
                finish();
            }
        });

    }
}
