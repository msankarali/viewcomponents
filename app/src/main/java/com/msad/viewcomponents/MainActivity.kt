package com.msad.viewcomponents

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    val name = intent.getStringExtra("keyName")
    val age = intent.extras?.getInt("keyAge")
    val isMale = intent.extras?.getBoolean("keyIsMale")

    textView.text = "Name: $name, Age: $age, isMale: $isMale"
  }
}
