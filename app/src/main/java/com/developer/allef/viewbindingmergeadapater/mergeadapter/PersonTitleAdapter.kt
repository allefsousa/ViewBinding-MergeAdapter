package com.developer.allef.viewbindingmergeadapater.mergeadapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.developer.allef.viewbindingmergeadapater.R

/**
 * @author allef.santos on 27/05/20
 */
class PersonTitleAdapter : RecyclerView.Adapter<PersonTitleAdapter.PersonAdressViewHolder>() {
    private lateinit var context: Context
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): PersonAdressViewHolder {
        context = parent.context
        return PersonAdressViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_horizontal,
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int = 1



    override fun onBindViewHolder(holder: PersonAdressViewHolder, position: Int) {}


    inner class PersonAdressViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

}