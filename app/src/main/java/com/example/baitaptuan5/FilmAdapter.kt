package com.example.baitaptuan5

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_item_film.view.*

class FilmAdapter(var  items: ArrayList<Film>, val context: Context) : RecyclerView.Adapter<FilmAdapter.FilmViewHolder>(){
    //lateinit var mListener: StudentItemCLickListener

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): FilmViewHolder {
        return FilmViewHolder(LayoutInflater.from(context).inflate(R.layout.activity_item_film, parent, false))
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(filmViewHolder: FilmViewHolder, position: Int) {
        filmViewHolder.tvTitle.text = "#$position ${items[position].name}"
        filmViewHolder.tvClass.text = items[position].classz
        Glide.with(context)
            .load( items[position].avatar)
            .centerCrop()
            .placeholder(R.drawable.avenger)
            .into(filmViewHolder.ivAvatar)


        //filmViewHolder.itemView.setOnClickListener {
            //mListener.onItemCLicked(position)
        //}

//        filmViewHolder.itemView.setOnLongClickListener {
//            mListener.onItemLongCLicked(position)
//            true
//        }
//    }
//
//    fun setListener(listener: StudentItemCLickListener) {
//        this.mListener = listener
//    }

    fun setData(items: ArrayList<Film>){
        this.items = items
        notifyDataSetChanged()
    }

}

    fun setData(items: ArrayList<Film>){
        this.items = items
        notifyDataSetChanged()
    }

    class FilmViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    var tvTitle = view.tvTitle
    var tvClass = view.tvClass
    var ivAvatar = view.ivAvatar
}

}