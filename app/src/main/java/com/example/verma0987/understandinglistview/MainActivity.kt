package com.example.verma0987.understandinglistview

import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var name = ArrayList<String>()
        name.add("rish")
        name.add("cat")
        name.add("man")


        val adapt = ArrayAdapter(this,android.R.layout.simple_list_item_1,name)
        list.adapter = adapt

        val cat = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.cat)
        val man1 = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.man1)
        val man2 = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.thisman)

        val listnames = ArrayList<Bitmap>()

        listnames.add(cat)
        listnames.add(man1)
        listnames.add(man2)

        list.onItemClickListener = AdapterView.OnItemClickListener { adapterView, view, i, l ->

            val intent = Intent(applicationContext,DetailActivity::class.java)

            intent.putExtra("n",name[i])



            var bit = listnames[i]
            var chosen = Globals.Chosen
            chosen.chosenImage = bit



            startActivity(intent)


        }








    }



}
