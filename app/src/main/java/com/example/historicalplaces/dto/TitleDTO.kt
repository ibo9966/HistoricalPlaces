package com.example.historicalplaces.dto

import com.example.historicalplaces.base.IBaseModel
import com.example.historicalplaces.base.IBaseModel.Companion.TITLE

data class TitleDTO (
    var title : String
):IBaseModel{
    override val type = TITLE
}