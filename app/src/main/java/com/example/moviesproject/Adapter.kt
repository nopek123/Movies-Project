package com.example.moviesproject

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.res_item_model.view.*


class Adapter: RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var items: List<MovieModel> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return MovieViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.res_item_model, parent, false),
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder){
            is MovieViewHolder -> {
                holder.bind(items[position])
            }
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    fun setDataSet(list: List<MovieModel>) {
        this.items = list
        notifyDataSetChanged()
    }

    class MovieViewHolder constructor(
        itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val movieModelName = itemView.input_name
        private val movieModelTimeMovie = itemView.input_timeMovie
        private val movieModelGenre = itemView.input_genre
        private val movieModelDescription = itemView.input_description
        private val movieModelImg = itemView.profile_movie


        fun bind(movieModel: MovieModel){

            movieModelName.text = movieModel.name
            movieModelTimeMovie.text = movieModel.timeMovie
            movieModelGenre.text = movieModel.genre
            movieModelDescription.text = movieModel.description

            val requestOptions = RequestOptions
                .placeholderOf(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_background)

            Glide.with(itemView.context)
                .applyDefaultRequestOptions(requestOptions)
                .load(movieModel.imgUrl)
                .into(movieModelImg)

        }
    }

}