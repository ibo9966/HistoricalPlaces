package com.example.historicalplaces.dto

import com.example.historicalplaces.base.IBaseModel
import com.example.historicalplaces.base.IBaseModel.Companion.TYPE_BODY

data class BodyDTO (
    var imagePath:Int,
    var description:String,
):IBaseModel{
    override val type=TYPE_BODY
}