package com.lokodom.myworkoutroutines.domain.model

import com.squareup.moshi.Json

data class Exercise(
    @field:Json(name = "exercise_base")
    val id : Int,
    val name: String,
    val description: String,
    val language: Int
)

