package com.example.moviesproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


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
        initView(view)
        initRecycleView()
        loadMovieListFrom()
    }

    private fun loadMovieListFrom() {
        val dataSource = DataSource.createDataSet()
        this.adapter.setDataSet(dataSource)
    }

    private fun initRecycleView() {
        this.adapter = Adapter()
        recyclerview.layoutManager = LinearLayoutManager(requireContext())
        recyclerview.adapter = this.adapter
    }

    private fun initView(view: View) {
        recyclerview = view.findViewById<RecyclerView>(R.id.fragment_recycle_view)
    }

}
