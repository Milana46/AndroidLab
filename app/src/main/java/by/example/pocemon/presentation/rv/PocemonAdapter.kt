package by.example.pocemon.presentation.rv

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import by.example.pocemon.R
import by.example.pocemon.domain.entity.PocemonEntity
import by.example.pocemon.presentation.Pocemon
import by.example.pocemon.presentation.detail.DetailActivity

class PocemonAdapter(private val pocemonList: List<PocemonEntity>) :
    RecyclerView.Adapter<PocemonAdapter.PocemonViewHolder>() {

    class PocemonViewHolder(itemView: View, private val onItemClicked: (Int) -> PocemonEntity) :
        RecyclerView.ViewHolder(itemView) {

        var imageView = itemView.findViewById<ImageView>(R.id.imageView2)
        var textview: TextView = itemView.findViewById(R.id.textView2)

        init {
            itemView.setOnClickListener {
                val info = onItemClicked(adapterPosition)
                itemView.context.startActivity(
                    DetailActivity.createIntent(
                        itemView.context,
                        info
                    )
                )
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PocemonViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_new, parent, false)
        return PocemonViewHolder(
            view
        ) { position -> pocemonList[position] }
    }

    override fun getItemCount(): Int {
        return pocemonList.size
    }

    override fun onBindViewHolder(holder: PocemonViewHolder, position: Int) {
        val pocemon = pocemonList[position]
        holder.imageView.setImageResource(pocemon.image)
        holder.textview.text = pocemon.name
    }
}


