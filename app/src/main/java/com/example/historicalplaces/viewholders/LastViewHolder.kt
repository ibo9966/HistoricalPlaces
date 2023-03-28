package com.example.historicalplaces.viewholders

import com.example.historicalplaces.base.BaseViewHolder
import com.example.historicalplaces.databinding.ItemLastBinding
import com.example.historicalplaces.databinding.ItemTitleBinding
import com.example.historicalplaces.dto.LastDTO
import com.example.historicalplaces.dto.TitleDTO

class LastViewHolder (binding: ItemLastBinding) : BaseViewHolder<LastDTO>(binding){
    private val _binding = binding
    override fun bindView(model: LastDTO, position: Int) {
        _binding.textViewLast.text=model.last
    }
}