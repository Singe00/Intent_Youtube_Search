package kr.ac.kumoh.ce.s20181131.w0702explicitintent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.widget.ImageViewCompat
import kr.ac.kumoh.ce.s20181131.w0702explicitintent.databinding.ActivityMainBinding
import java.nio.channels.InterruptedByTimeoutException

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.btnExplicitIntent.setOnClickListener {
            //val uri = Uri.parse("http://Singe00.github.io")
            //val intent = Intent(Intent.ACTION_VIEW,uri)
            val intent = Intent(this,ImageActivity::class.java)
            startActivity(intent)
        }

        binding.btnYoutube.setOnClickListener {
            val uri = Uri.parse("https://www.youtube.com/results?search_query="+binding.editText.text.toString())
            val intent = Intent(Intent.ACTION_VIEW,uri)
            startActivity(intent)
        }

    }
}