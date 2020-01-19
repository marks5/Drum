package br.com.drum.feature.home

import android.content.Context
import android.view.View
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import br.com.player.ui.Player
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.list_item_home.view.*

class AnimeListItemViewHolder(
    itemView: View
) : RecyclerView.ViewHolder(itemView) {
    fun bind(movie: AnimeListState, context: Context) {
        Glide.with(itemView)
            .load(movie.poster)
            .into(itemView.poster)

        itemView.title.text = movie.name

        itemView.setOnClickListener {
            context.startActivity(Player.launchIntent(context, "https://bestvpn.org/html5demos/assets/dizzy.mp4"))
        }
    }
}
