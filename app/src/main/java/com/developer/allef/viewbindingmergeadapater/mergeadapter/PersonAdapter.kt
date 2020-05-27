package com.developer.allef.viewbindingmergeadapater.mergeadapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.developer.allef.viewbindingmergeadapater.R
import com.developer.allef.viewbindingmergeadapater.data.Item
import kotlinx.android.synthetic.main.item_person.view.*

/**
 * @author allef.santos on 27/05/20
 */
class PersonAdapter : RecyclerView.Adapter<PersonAdapter.PersonAdressViewHolder>() {
    private lateinit var context: Context
    private val listItem = mutableListOf<Item>()
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): PersonAdressViewHolder {
        context = parent.context
        return PersonAdressViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_person,
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int = listItem.size

    fun addItem(newList: List<Item>) {
        listItem.clear()
        listItem.addAll(newList)
        notifyDataSetChanged()
    }

    override fun onBindViewHolder(holder: PersonAdressViewHolder, position: Int) {
        val item = listItem[position]
        holder.itemView.item_name.text = item.name
        Glide.with(context).load(item.image).into(holder.itemView.item_image)
    }


    inner class PersonAdressViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

}