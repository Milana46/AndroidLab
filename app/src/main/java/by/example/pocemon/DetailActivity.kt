package by.example.pocemon

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

private const val POCEMON_INFO = "POCEMON_INFO"


class DetailActivity : AppCompatActivity() {


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail2)


        val info = intent.getSerializableExtra(POCEMON_INFO) as Pocemon
        val btnback = findViewById<Button>(R.id.btnback)
        btnback.setOnClickListener {
            finish()
        }


        findViewById<TextView>(R.id.nameValue).text = info.name
        findViewById<TextView>(R.id.heightValue).text = info.height.toString()
        findViewById<TextView>(R.id.weightValue).text = info.weight.toString()



        findViewById<ImageView>(R.id.imageView).setImageResource(
          info.image
        )

    }

    companion object {
        fun createIntent(context: Context, info: Pocemon): Intent {
            return Intent(
                context,
                DetailActivity::class.java
            ).putExtra(POCEMON_INFO, info)
        }
    }
}




