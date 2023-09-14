package by.example.pocemon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var pocemonList: ArrayList<Pocemonmain>
    private lateinit var pocemonAdapter: PocemonAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        pocemonList = ArrayList()
        pocemonList.add(Pocemonmain(R.drawable.bulbasaur, Pocemon("Bulbasaur", 7, 123)))
        pocemonList.add(Pocemonmain(R.drawable.venisaur, Pocemon("Venisaur", 6, 345)))
//        pocemonList.add(Pocemonmain(R.drawable.venisaur,"Venusaur"))
//        pocemonList.add(Pocemonmain(R.drawable.bulbasaur,"pokemon 4"))
//        pocemonList.add(Pocemonmain(R.drawable.bulbasaur,"pokemon 4"))
//        pocemonList.add(Pocemonmain(R.drawable.bulbasaur,"pokemon 4"))
//        pocemonList.add(Pocemonmain(R.drawable.bulbasaur,"pokemon 4"))
//        pocemonList.add(Pocemonmain(R.drawable.bulbasaur,"pokemon 4"))
//        pocemonList.add(Pocemonmain(R.drawable.bulbasaur,"pokemon 22"))
//        pocemonList.add(Pocemonmain(R.drawable.bulbasaur,"pokemon 4"))

        recyclerView = findViewById<RecyclerView>(R.id.recycler);
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)

        pocemonAdapter = PocemonAdapter(pocemonList)
        pocemonAdapter
        recyclerView.adapter = pocemonAdapter;

    }

}






