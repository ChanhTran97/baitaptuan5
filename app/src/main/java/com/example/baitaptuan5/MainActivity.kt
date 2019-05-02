package com.example.baitaptuan5

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var film: ArrayList<Film> = ArrayList()
    lateinit var filmAdapter: FilmAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addFilm()
        rvFilm.layoutManager = LinearLayoutManager(this)

        filmAdapter = FilmAdapter(film, this)
        rvFilm.adapter = filmAdapter

    }

    private fun  removeItem(position: Int){
        film.removeAt(position)
        filmAdapter.setData(film)
    }

    private fun  addFilm() {
        film.add(Film("phim1", "hfahjssahdjahdjsadhja", R.drawable.avenger))
    }
}
