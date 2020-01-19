package br.com.drum.feature.home

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.drum.R

class HomeListAdapter : RecyclerView.Adapter<AnimeListItemViewHolder>() {

    private lateinit var context: Context
    var elements: List<AnimeListState> = emptyList()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimeListItemViewHolder {
        context = parent.context
        val view = LayoutInflater.from(context)
            .inflate(R.layout.list_item_home, parent, false)

        return AnimeListItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: AnimeListItemViewHolder, position: Int) {
        holder.bind(elements[position], context)
    }

    override fun getItemCount() = elements.size

}