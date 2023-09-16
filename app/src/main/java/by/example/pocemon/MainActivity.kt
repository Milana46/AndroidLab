package by.example.pocemon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {



    private lateinit var recyclerView: RecyclerView
    private lateinit var pocemonList: ArrayList<Pocemon>
    private lateinit var pocemonAdapter: PocemonAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        pocemonList = ArrayList()
        pocemonList.add(Pocemon(R.drawable.bulbasaur,"Bulbasaur", 7, 123))
        pocemonList.add(Pocemon(R.drawable.venisaur, "Venisaur", 6, 345))


        recyclerView = findViewById<RecyclerView>(R.id.recycler);
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)

        pocemonAdapter = PocemonAdapter(pocemonList)
        pocemonAdapter
        recyclerView.adapter = pocemonAdapter;

    }



}

private fun <E> java.util.ArrayList<E>.add(pocemon: Pocemon) {
    TODO("Not yet implemented")
}









