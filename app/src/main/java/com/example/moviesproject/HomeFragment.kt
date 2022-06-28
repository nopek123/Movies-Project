package com.example.moviesproject

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.moviesproject.model.MovieListResponse
import com.example.moviesproject.model.toModel
import com.example.moviesproject.remote.ApiMovie
import com.example.moviesproject.remote.RetrofitSetup
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class HomeFragment : Fragment() {

    private lateinit var adapter: Adapter
    private lateinit var recyclerview: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRecycleView(view)
        loadMovieListFrom()
    }

    private fun loadMovieListFrom() {

        val apiInterface: ApiMovie = RetrofitSetup.createService(ApiMovie::class.java)
        val call: Call<MovieListResponse> = apiInterface.getMovieList()

        call.enqueue(object : Callback<MovieListResponse> {
            override fun onResponse(
                call: Call<MovieListResponse>,
                response: Response<MovieListResponse>
            ) {
                if (response.isSuccessful) {
                    val movieListResponse = response.body()
                    val movieModelList = movieListResponse?.results?.map {
                        it.toModel()
                    }
                    if (!movieModelList.isNullOrEmpty()){
                        adapter.setDataSet(movieModelList)
                    }
                } else {
                    Log.e("###", response.message())
                }
            }

            override fun onFailure(call: Call<MovieListResponse>, t: Throwable) {
                Log.e("###", t.message ?: "")
            }
        })
    }

    private fun initRecycleView(view: View) {
        this.adapter = Adapter()
        recyclerview = view.findViewById(R.id.fragment_recycle_view)
        recyclerview.layoutManager = LinearLayoutManager(requireContext())
        recyclerview.adapter = this.adapter
    }
}
