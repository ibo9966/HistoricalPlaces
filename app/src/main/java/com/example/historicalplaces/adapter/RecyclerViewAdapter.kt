package com.example.historicalplaces.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.historicalplaces.R
import com.example.historicalplaces.base.IBaseModel
import com.example.historicalplaces.base.IBaseModel.Companion.LAST
import com.example.historicalplaces.base.IBaseModel.Companion.TITLE
import com.example.historicalplaces.base.IBaseModel.Companion.TYPE_BODY
import com.example.historicalplaces.databinding.ItemBodyBinding
import com.example.historicalplaces.databinding.ItemLastBinding
import com.example.historicalplaces.databinding.ItemTitleBinding
import com.example.historicalplaces.dto.BodyDTO
import com.example.historicalplaces.dto.LastDTO
import com.example.historicalplaces.dto.TitleDTO
import com.example.historicalplaces.viewholders.BodyViewHolder
import com.example.historicalplaces.viewholders.LastViewHolder
import com.example.historicalplaces.viewholders.TitleViewHolder

class RecyclerViewAdapter(
    private var items : MutableList<IBaseModel>
):RecyclerView.Adapter<RecyclerView.ViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return when (viewType){
            TYPE_BODY ->
                BodyViewHolder(
                    ItemBodyBinding.inflate(
                        layoutInflater,
                        parent,
                        false
                    )
                )
            TITLE->
                TitleViewHolder(
                    ItemTitleBinding.inflate(
                        layoutInflater,
                        parent,
                        false
                    )
                )
            LAST->
                LastViewHolder(
                ItemLastBinding.inflate(
                    layoutInflater,
                    parent,
                    false
                )
            )
            else-> throw IllegalArgumentException("Invalid view type")
        }
    }

    override fun getItemCount(): Int {
       return items.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(items[position].type){
            TYPE_BODY->
                (holder as BodyViewHolder).bindView(
                    (items[position] as BodyDTO),
                    position
                )
            TITLE ->{
                (holder as TitleViewHolder).bindView(
                    (items[position] as TitleDTO),
                    position
                )
            }
            LAST->{
                (holder as LastViewHolder).bindView(
                    (items[position] as LastDTO),
                    position
                )
            }
        }

    }

    override fun getItemViewType(position: Int): Int {
        return items[position].type
    }

}