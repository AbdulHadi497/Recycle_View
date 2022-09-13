package com.example.recycleview
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdapterView (private var itemsList: List<ItemView>) :
    RecyclerView.Adapter<AdapterView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val itemView = itemsList[position]

        //holder.imageView.setImageResource(itemView.image)
        holder.txtView.text = itemView.text
        holder.txtView_2.text = itemView.text_2
        holder.txtView_3.text = itemView.text_3
    }

    override fun getItemCount(): Int {
        return itemsList.size
    }

    // Holds the views for adding it to image and text
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val imageView: ImageView = view.findViewById<ImageView>(R.id.Image_V)
        val txtView : TextView = view.findViewById<TextView>(R.id.T_1)
        val txtView_2 : TextView = view.findViewById<TextView>(R.id.T_2)
        val txtView_3 : TextView = view.findViewById<TextView>(R.id.T_3)

    }
}