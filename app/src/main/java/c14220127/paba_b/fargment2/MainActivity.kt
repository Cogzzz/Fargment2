package c14220127.paba_b.fargment2

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.frameContainer)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val mfragmeentManager = supportFragmentManager
        val hal1 = Halaman1()
        mfragmeentManager.findFragmentByTag(MainActivity::class.java.simpleName)
        mfragmeentManager
            .beginTransaction()
            .add(R.id.frameContainer, hal1, Halaman1::class.java.simpleName)
            .commit()
    }
}