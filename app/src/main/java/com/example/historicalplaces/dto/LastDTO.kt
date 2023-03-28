package com.example.historicalplaces.dto

import com.example.historicalplaces.base.IBaseModel

data class LastDTO (
    var last : String
): IBaseModel {
    override val type = IBaseModel.LAST
}