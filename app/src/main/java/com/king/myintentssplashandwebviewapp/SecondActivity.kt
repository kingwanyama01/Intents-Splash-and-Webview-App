package com.king.myintentssplashandwebviewapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        //To check that the value that is coming in is not null, use double exclamation marks on the intent.extras expression
        val bundle:Bundle = intent.extras!!

        var my_received_name = bundle.get("x")
        var my_received_age = bundle.get("y")

        mTvName.text = my_received_name.toString()
        mTvAge.text = my_received_age.toString()

    }
}
