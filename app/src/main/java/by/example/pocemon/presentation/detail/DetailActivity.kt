package by.example.pocemon.presentation.detail

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import by.example.pocemon.R
import by.example.pocemon.databinding.ActivityDetail2Binding
import by.example.pocemon.domain.entity.PocemonEntity
import by.example.pocemon.presentation.Pocemon

class DetailActivity : AppCompatActivity() {
    private lateinit var binding:ActivityDetail2Binding


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {

        binding=ActivityDetail2Binding.inflate(layoutInflater)

        super.onCreate(savedInstanceState)
       setContentView(binding.root)



        val info = intent.getSerializableExtra(POCEMON_INFO) as PocemonEntity
        val btnback = findViewById<Button>(R.id.btnback)
        btnback.setOnClickListener {
            finish()
        }


        binding.nameValue.text=info.name
        binding.heightValue.text=info.height.toString()
        binding.weightValue.text=info.weight.toString()
        binding.imageView.setImageResource(info.image)

    }

    companion object {
        fun createIntent(context: Context, info: PocemonEntity): Intent {
            return Intent(
                context,
                DetailActivity::class.java
            ).putExtra(POCEMON_INFO, info)
        }

        private const val POCEMON_INFO = "POCEMON_INFO"
    }
}




