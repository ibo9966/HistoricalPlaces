package com.example.historicalplaces.viewholders

import com.example.historicalplaces.base.BaseViewHolder
import com.example.historicalplaces.databinding.ItemTitleBinding
import com.example.historicalplaces.dto.TitleDTO

class TitleViewHolder (binding:ItemTitleBinding) : BaseViewHolder<TitleDTO>(binding){
    private val _binding = binding
    override fun bindView(model: TitleDTO, position: Int) {
        _binding.textViewTitle.text=model.title
    }
}