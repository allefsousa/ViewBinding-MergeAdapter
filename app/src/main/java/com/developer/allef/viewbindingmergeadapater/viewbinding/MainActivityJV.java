package com.developer.allef.viewbindingmergeadapater.viewbinding;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.developer.allef.viewbindingmergeadapater.R;

public class MainActivityJV extends AppCompatActivity {

    Button btnComprar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainjv);

        btnComprar = findViewById(R.id.btn_comprar);

        btnComprar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivityJV.this, "Compra efetuada", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
