package com.example.verma0987.understandinglistview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        /**
        val intent = intent
        val name = intent.getStringExtra("n")
        textView.text = name
        **/
        val chosen = Globals.Chosen
        val selectedText = chosen.returnText()
        val selectedImage = chosen.returnImage()
        imageView.setImageBitmap(selectedImage)
        textView.text = selectedText

    }
}
