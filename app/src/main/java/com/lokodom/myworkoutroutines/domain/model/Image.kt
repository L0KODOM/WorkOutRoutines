package com.lokodom.myworkoutroutines.domain.model

import com.squareup.moshi.Json

data class Image(
    @field:Json(name = "exercise_base")
    val id: Int,
    val image: String
)
