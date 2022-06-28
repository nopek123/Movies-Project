package com.example.moviesproject

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.moviesproject.databinding.LayoutItemMovieBinding
import java.util.Collections.emptyList

class Adapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var items: List<MovieModel> = emptyList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val binding =
            LayoutItemMovieBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MovieViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
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

    class MovieViewHolder(
        binding: LayoutItemMovieBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        private val movieModelName = binding.inputName
        private val movieModelTimeMovie = binding.inputTimeMovie
        private val movieModelGenre = binding.inputGenre
        private val movieModelDescription = binding.inputDescription
        private val movieModelImg = binding.profileMovie


        fun bind(movieModel: MovieModel) {

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
