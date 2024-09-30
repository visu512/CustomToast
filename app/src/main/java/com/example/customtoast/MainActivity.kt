package com.example.customtoast

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.shashank.sony.fancytoastlib.FancyToast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val defaultToast =  findViewById<Button>(R.id.defaultToast)
        val fancyToast = findViewById<Button>(R.id.fancyTost)

        // click on button default
        defaultToast.setOnClickListener{
            Toast.makeText(this, "This is default toast \uD83D\uDE00", Toast.LENGTH_SHORT).show()
        }

        // click on fancy btn  (fancy toast github)
        fancyToast.setOnClickListener {
//            FancyToast.makeText(this,"Hello World !",FancyToast.LENGTH_LONG,FancyToast.SUCCESS,false).show();

//            FancyToast.makeText(this,"Hello World !",FancyToast.LENGTH_LONG,FancyToast.INFO,false).show();

//        FancyToast.makeText(this,"Hello World !",FancyToast.LENGTH_LONG,FancyToast.WARNING,false).show();

//            FancyToast.makeText(this,"Hello World !",FancyToast.LENGTH_LONG,FancyToast.ERROR,true).show();

//            FancyToast.makeText(this,"Hello World !",FancyToast.LENGTH_LONG,FancyToast.CONFUSING,true).show();

            FancyToast.makeText(this, "I'm a Toast",FancyToast.LENGTH_LONG,FancyToast.SUCCESS, false).show();

      }
    }

}