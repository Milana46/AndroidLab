package by.example.pocemon

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PocemonAdapter(private val pocemonList: ArrayList<Pocemonmain>) :
    RecyclerView.Adapter<PocemonAdapter.PocemonViewHolder>() {

    //var onItemClick:((LoanAgreemenData)->Unit)?=null
    class PocemonViewHolder(itemView: View, private val onItemClicked: (Int) -> Pocemonmain) :
        RecyclerView.ViewHolder(itemView), View.OnClickListener {

        var imageView = itemView.findViewById<ImageView>(R.id.imageView2)
        var textview: TextView = itemView.findViewById(R.id.textView2)

        init {
            itemView.setOnClickListener(this)
        }

        override fun onClick(position: View) {
            val info =onItemClicked(adapterPosition)
            itemView.context.startActivity(
                DetailActivity.createIntent(
                    itemView.context,
                   info.image,info.poce
                )
            )
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PocemonViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_new, parent, false)
        return PocemonViewHolder(
            view
        ) { position -> pocemonList[position]}
    }

    override fun getItemCount(): Int {
        return pocemonList.size
    }

    override fun onBindViewHolder(holder: PocemonViewHolder, position: Int) {
        val pocemon = pocemonList[position]
        holder.imageView.setImageResource(pocemon.image)
        holder.textview.text = pocemon.poce.name

        //holder.itemView.setOnClickListener{
        // onItemClick?.invoke(pocemon)
    }
}


