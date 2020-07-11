package android.example.a2am

import android.annotation.SuppressLint
import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import android.os.Handler
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SplashScreen: AppCompatActivity() {
    lateinit var handler: Handler
    private lateinit var imageView: ImageView
    private lateinit var textView: TextView
    @SuppressLint("SourceLockedOrientationActivity")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_screen)
        imageView=findViewById(R.id.splash)
        textView=findViewById(R.id.splashText)
        imageView.animate().alpha(1.0f).scaleX(1.1f).scaleY(1.1f).setDuration(2500)
        textView.animate().alpha(1.0f).scaleX(1.1f).scaleY(1.1f).setDuration(2500)
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
        handler= Handler()
        handler.postDelayed({
            val intent= Intent(baseContext,LoginActivity::class.java)
            startActivity(intent)
            finish()
        },3000)

    }

}