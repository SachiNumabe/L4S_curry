package com.example.l4s_curry

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    val people = arrayOf<String>("ランディ","ウーノ","デイジー","ビルソン")
    val food = arrayOf<String>("カレー","みそしる","ちゃーはん","エビチリ","ラーメン","スープ")
    val result = arrayOf<String>("よそえました","よそえませんでした")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun serveFood(view: View?){
        val randomName = Random()
        val index = randomName.nextInt(4)
        val name = people[index]
        nameTextView.text = name + "に"
        foodTextView.text = food[Random().nextInt(6)] + "を"
        varbTextView.text = result[Random().nextInt(2)]

        //  if(Random().nextInt(100) < 50){
        //     varbTextView.text = "よそえました"
        //      varbTextView.textSize = 14F
        //  }else{
        //     varbTextView.text = "よそえませんでした"
        //      varbTextView.textSize = 20F
        //  }
    }
}