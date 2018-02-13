package com.example.luissancar.joystick

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

import kotlinx.android.synthetic.main.activity_main.*
import ninja.eigenein.joypad.JoypadView

class MainActivity : AppCompatActivity(),  JoypadView.Listener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        joypad_view.setListener(this)

    }

    override fun onUp() {

    }


    override fun onMove(distancia: Float, x: Float, y: Float) {
        textView.setText("p0: $distancia, x: $x, y: $y"); //To change body of created functions use File | Settings | File Templates.
        println("distancia: $distancia, x: $x, y: $y")//To change body of created functions use File | Settings | File Templates.



    }


}
