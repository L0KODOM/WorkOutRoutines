package com.lokodom.myworkoutroutines.domain.model

import com.squareup.moshi.Json

data class FullExerciseInfo(
    val id : Int? = null,
    val category: Category? = null,
    val muscles: List<Muscles>? = null,
    val musclesSecondary: List<MusclesSecondary>? = null,
    val equipment: List<Equipment>? = null,
    val images:List<Image>? = null,
    val exercises: List<Exercise>? = null
)
