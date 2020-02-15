package com.msad.viewcomponents

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_splash.*

class SplashActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_splash)

    // val btnOpenMainActivity = findViewById<Button>(R.id.btnOpenMainActivity)
    btnOpenMainActivity //synthetic

    btnOpenMainActivity.setOnClickListener {

      val intent = Intent(this, MainActivity::class.java)

      val (keyName, keyAge, keyIsMale) = UserProfile("Servet", 27, true)

      val userProfile = object {
        val keyName: String = "Servet"
        val keyAge: Int = 27
        val keyIsMale: Boolean = true
      }

      intent.putExtra("keyName", "Servet")
      intent.putExtra("keyAge", 27)

      intent.putExtra(UserProfileType.KEY_NAME.name, userProfile.keyName)

      val bundle = Bundle()
      bundle.putInt(UserProfileType.KEY_AGE.name, userProfile.keyAge)
      bundle.putBoolean(UserProfileType.KEY_IS_MALE.name, userProfile.keyIsMale)

      intent.putExtras(bundle)

      startActivity(intent)
      finish()
    }

  }
}


/*

class SplashActivity: Activity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

  }
}

 */
