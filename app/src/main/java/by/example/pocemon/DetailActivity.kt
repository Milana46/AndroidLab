package by.example.pocemon

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

private const val POKEMON_INFO = "POKEMON_INFO"
private const val POCEMON_IMAGE = "POCEMON_IMAGE"


class DetailActivity : AppCompatActivity() {


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail2)

        //val pocemon=intent.get<LoanAgreemenData>("pocemon")
        /*if(pocemon!=null){
            val textView:TextView=findViewById(R.id.nameValue)
            val textView1:TextView=findViewById(R.id.weightValue)
            val textView2:TextView=findViewById(R.id.heightValue)
            val imageView:ImageView=findViewById(R.id.imageView)

            textView.text=pocemon.name
            //imageView.setImageResource(pocemon.image)
            textView1.text= pocemon.weight.toString()
            textView2.text=pocemon.height.toString()

        }*/

        val info = intent.getSerializableExtra(POKEMON_INFO) as LoanAgreemenData
        val image = intent.getSerializableExtra(POCEMON_IMAGE) as Int
        val btnback = findViewById<Button>(R.id.btnback)
        btnback.setOnClickListener {
            finish()
        }


        findViewById<TextView>(R.id.nameValue).text = info.name
        findViewById<TextView>(R.id.heightValue).text = info.height.toString()
        findViewById<TextView>(R.id.weightValue).text = info.weight.toString()


        findViewById<ImageView>(R.id.imageView).setImageResource(
            image
        )
    }

    companion object {
        fun createIntent(context: Context, image: Int, info: LoanAgreemenData): Intent {
            return Intent(
                context,
                DetailActivity::class.java
            ).putExtra(POKEMON_INFO, info).putExtra(POCEMON_IMAGE, image)
        }
    }
}



