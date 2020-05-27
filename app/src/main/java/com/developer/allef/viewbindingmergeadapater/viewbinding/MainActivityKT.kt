package com.developer.allef.viewbindingmergeadapater.viewbinding

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.developer.allef.viewbindingmergeadapater.R
import kotlinx.android.synthetic.main.activity_mainkt.*

class MainActivityKT : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mainkt)

        btn_comprar.setOnClickListener {
            Toast.makeText(this, "Compra efetuada", Toast.LENGTH_SHORT).show()
        }

    }
}
