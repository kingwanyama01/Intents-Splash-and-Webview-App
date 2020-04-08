package com.king.myintentssplashandwebviewapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mBtnNext.setOnClickListener {
            //Receive the name and age from the user
            var name = mEdtName.text.toString()
            var age = mEdtAge.text.toString()
            if (name.isEmpty() or age.isEmpty()){
                Toast.makeText(this,"Please fill in all the inputs",Toast.LENGTH_LONG).show()
            }else{
                //Proceed to the next page currying both the name and the age values
                intent = Intent(this,SecondActivity::class.java)
                intent.putExtra("x",name)
                intent.putExtra("y",age)
                startActivity(intent)
            }
        }

        mBtnGoToWeb.setOnClickListener {
            intent = Intent(this,WebActivity::class.java)
            startActivity(intent)
        }
    }
}
