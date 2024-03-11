package com.lokodom.myworkoutroutines.domain.model

import com.squareup.moshi.Json

data class Muscles(
    val id: Int,
    val name: String,
    @field:Json(name = "is_front")
    val front: Boolean,
    @field:Json(name = "image_url_main")
    val image: String
)

data class MusclesSecondary(
    val id: Int,
    val name: String,
    @field:Json(name = "is_front")
    val front: Boolean,
    @field:Json(name = "image_url_main")
    val image: String
)
