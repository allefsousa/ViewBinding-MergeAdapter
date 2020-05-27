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

public class MainActivityJV extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainjvBinding binding = ActivityMainjvBinding.inflate(LayoutInflater.from(this));
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("Confirmar Compra");

        binding.btnConfirmarCompra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivityJV.this, "Compra efetuada", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivityJV.this,MainActivityKT.class));
                finish();
            }
        });

    }
}
