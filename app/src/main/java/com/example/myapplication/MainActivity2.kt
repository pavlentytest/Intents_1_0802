package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.google.android.material.snackbar.Snackbar

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val bundle = intent.extras
        val data = bundle?.getString("key")
        Snackbar.make(findViewById(R.id.root2),data.toString(), Snackbar.LENGTH_LONG).show();

        val btn3: Button = findViewById(R.id.button3)
        val editText: EditText = findViewById(R.id.editText)
        btn3.setOnClickListener {
            val intent = Intent()
            intent.putExtra("key2", editText.text.toString())
            setResult(200,intent)
            finish()
        }

    }
}