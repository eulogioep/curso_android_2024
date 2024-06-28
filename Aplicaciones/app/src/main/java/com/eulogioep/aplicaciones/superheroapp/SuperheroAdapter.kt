package com.eulogioep.aplicaciones.superheroapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.eulogioep.aplicaciones.R

class SuperheroAdapter(var superheroList: List<SuperHeroItemResponse> = emptyList()) :
    RecyclerView.Adapter<SuperheroViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperheroViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return SuperheroViewHolder(layoutInflater.inflate(R.layout.item_superhero, parent, false))

    }

    override fun onBindViewHolder(viewHolder: SuperheroViewHolder, position: Int) {
        viewHolder.bind(superheroList[position])
    }

    override fun getItemCount(): Int = superheroList.size

    fun updateList(superheroList: List<SuperHeroItemResponse>) {
        this.superheroList = superheroList
        notifyDataSetChanged()
    }
}