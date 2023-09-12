package by.example.pocemon

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlin.collections.listOf as listOf


class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
   private lateinit var pocemonList:ArrayList<Pocemonmain>
  private lateinit var pocemonAdapter: PocemonAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        pocemonList=ArrayList()
        pocemonList.add(Pocemonmain(R.drawable.bulbasaur,LoanAgreemenData("Bulbasaur",7,123)))
        pocemonList.add(Pocemonmain(R.drawable.venisaur,LoanAgreemenData("Venisaur",6,345)))
//        pocemonList.add(Pocemonmain(R.drawable.venisaur,"Venusaur"))
//        pocemonList.add(Pocemonmain(R.drawable.bulbasaur,"pokemon 4"))
//        pocemonList.add(Pocemonmain(R.drawable.bulbasaur,"pokemon 4"))
//        pocemonList.add(Pocemonmain(R.drawable.bulbasaur,"pokemon 4"))
//        pocemonList.add(Pocemonmain(R.drawable.bulbasaur,"pokemon 4"))
//        pocemonList.add(Pocemonmain(R.drawable.bulbasaur,"pokemon 4"))
//        pocemonList.add(Pocemonmain(R.drawable.bulbasaur,"pokemon 22"))
//        pocemonList.add(Pocemonmain(R.drawable.bulbasaur,"pokemon 4"))

        recyclerView = findViewById<RecyclerView>( R.id.recycler);
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager= LinearLayoutManager(this)
        pocemonAdapter = PocemonAdapter(pocemonList)
        recyclerView.adapter = pocemonAdapter;


         /*pocemonAdapter.onItemClick={
             val intent=Intent(this,DetailActivity::class.java)
             intent.putExtra("pocemon",it)
             startActivity(intent)
         }*/

       /* val poce = findViewById<RecyclerView>( R.id.recycler)
        poce.setOnClickListener {
            startActivity(
                DetailActivity.createIntent(
                    this,
                    LoanAgreemenData(name = "bulbasaur", height = 7, weight = 69)

                )
            )*/
        }

}






