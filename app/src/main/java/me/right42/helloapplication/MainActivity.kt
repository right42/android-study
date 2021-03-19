package me.right42.helloapplication

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val findButton = findViewById<Button>(R.id.button)
        findButton.setOnClickListener {
            Toast.makeText(applicationContext, "버튼을 눌렀어요", Toast.LENGTH_SHORT)
        }
    }
}