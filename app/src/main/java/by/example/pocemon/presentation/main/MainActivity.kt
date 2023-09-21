package by.example.pocemon.presentation.main

import android.os.Bundle
import android.view.inputmethod.InputBinding
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import by.example.pocemon.R
import by.example.pocemon.data.TestDataFactory
import by.example.pocemon.presentation.Pocemon
import by.example.pocemon.presentation.detail.DetailActivity
import by.example.pocemon.presentation.rv.PocemonAdapter


class MainActivity : AppCompatActivity() {


    private lateinit var recyclerView: RecyclerView
    private lateinit var pocemonAdapter: PocemonAdapter


    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val interactor = TestDataFactory(this)
        val pocemonList = interactor.getPocemonList()

        recyclerView = findViewById<RecyclerView>(R.id.recycler);
        recyclerView.layoutManager = LinearLayoutManager(this)

        pocemonAdapter = PocemonAdapter(pocemonList)
        recyclerView.adapter = pocemonAdapter;


    }




}